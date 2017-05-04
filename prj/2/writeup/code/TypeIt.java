/**
 * file: TypeIt.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Project 2
 * due date: May 9, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */

import java.util.*; // reading from file
import java.awt.*; // GUI
import java.awt.event.*; // event handling
import java.io.*; // writing to file
import javax.swing.*; // the main JFrame design
import javax.swing.event.*;
import javax.swing.undo.*;

public class TypeIt extends JFrame {
  static JTextArea mainarea;
  JMenuBar mbar;
  JMenu mnuFile, mnuEdit, mnuFormat, mnuHelp;
  JMenuItem itmNew, itmOpen, itmSave, itmSaveAs, itmExit, itmCut, itmCopy, 
  itmPaste, itmFontColor, itmFind, itmReplace, itmFont;
  
  JButton btnNew, btnOpen, btnSave, btnSaveAs, btnCut, btnCopy, btnPaste, 
  btnFind, btnReplace, btnFont, btnFontColor;
  
  JCheckBoxMenuItem wordWrap;
  String filename;
  JFileChooser jc;
  String fileContent;
  UndoManager undo;
  UndoAction undoAction;
  RedoAction redoAction;
  String findText;
  int fnext = 1;
  public static TypeIt frmMain = new TypeIt();
  Fonts font;
  JToolBar toolbar;
  
  public TypeIt() {
    initComponent();
    
    itmSave.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        save();
      }
    });
    btnSave.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        save();
      }
    });
    
    itmSaveAs.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        saveAs();
      }
    });
    btnSaveAs.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        saveAs();
      }
    });
    
    itmOpen.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        open();
      }
    });
    btnOpen.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        open();
      }
    });
    
    itmNew.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        open_new();
      }
    });
    btnNew.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        open_new();
      }
    });
    
    itmExit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    
    itmCut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainarea.cut();
      }
    });
    btnCut.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainarea.cut();
      }
    });
    
    itmCopy.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainarea.copy();
      }
    });
    btnCopy.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainarea.copy();
      }
    });
    
    itmPaste.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainarea.paste();
      }
    });
    btnPaste.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainarea.paste();
      }
    });
    
    mainarea.getDocument().addUndoableEditListener(new UndoableEditListener() {
      @Override
      public void undoableEditHappened(UndoableEditEvent e) {
        undo.addEdit(e.getEdit());
        undoAction.update();
        redoAction.update();
      }
    });
    
    wordWrap.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(wordWrap.isSelected()) {
          mainarea.setLineWrap(true);
          mainarea.setWrapStyleWord(true);
        }
        else {
          mainarea.setLineWrap(false);
          mainarea.setWrapStyleWord(false);
        }
      }
    });
    
    itmFontColor.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(rootPane, "Choose Font Color", 
        Color.BLUE);
        mainarea.setForeground(c);
      }
    });
    btnFontColor.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(rootPane, "Choose Font Color", 
        Color.BLUE);
        mainarea.setForeground(c);
      }
    });
    
    itmFind.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new FindReplace(frmMain, false);
      }
    });
    btnFind.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new FindReplace(frmMain, false);
      }
    });
    
    itmReplace.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new FindReplace(frmMain, true);
      }
    });
    btnReplace.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new FindReplace(frmMain, true);
      }
    });
    
    itmFont.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        font.setVisible(true);
      }
    });
    btnFont.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        font.setVisible(true);
      }
    });
    
    font.getOk().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainarea.setFont(font.font());
        font.setVisible(false);
      }
    });
    
    font.getCancel().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        font.setVisible(false);
      }
    });
  }
  
  private void initComponent() {
    jc = new JFileChooser(".");
    mainarea = new JTextArea();
    undo = new UndoManager();
    font = new Fonts();
    toolbar = new JToolBar();
    getContentPane().add(toolbar, BorderLayout.NORTH);
    ImageIcon undoIcon = new ImageIcon(getClass().getResource("/img/undo.png"));
    ImageIcon redoIcon = new ImageIcon(getClass().getResource("/img/redo.png"));
    undoAction = new UndoAction(undoIcon);
    redoAction = new RedoAction(redoIcon);
    getContentPane().add(mainarea);
    getContentPane().add(new JScrollPane(mainarea), BorderLayout.CENTER);
    setTitle("Untitled Notepad");
    setSize(1920, 1080);
    
    //menu bar
    mbar = new JMenuBar();
    
    //menu
    mnuFile = new JMenu("File");
    mnuEdit = new JMenu("Edit");
    mnuFormat = new JMenu("Format");
    mnuHelp = new JMenu("Help");
    
    //add icon to menu item
    ImageIcon newIcon = new ImageIcon(getClass().getResource("/img/new.png"));
    ImageIcon openIcon = new ImageIcon(getClass().getResource("/img/open.png"));
    ImageIcon saveIcon = new ImageIcon(getClass().getResource("/img/save.png"));
    ImageIcon saveAsIcon = new ImageIcon(getClass().getResource
    ("/img/saveAs.png"));
    ImageIcon exitIcon = new ImageIcon(getClass().getResource("/img/exit.png"));
    ImageIcon cutIcon = new ImageIcon(getClass().getResource("/img/cut.png"));
    ImageIcon copyIcon = new ImageIcon(getClass().getResource("/img/copy.png"));
    ImageIcon pasteIcon = new ImageIcon(getClass().getResource
    ("/img/paste.png"));
    ImageIcon findIcon = new ImageIcon(getClass().getResource("/img/find.png"));
    ImageIcon replaceIcon = new ImageIcon(getClass().getResource
    ("/img/replace.png"));
    ImageIcon fontColorIcon = new ImageIcon(getClass().getResource
    ("/img/fontColor.png"));
    ImageIcon fontIcon = new ImageIcon(getClass().getResource("/img/font.png"));
    
    //toolbar button icons
    btnNew = new JButton(newIcon);
    btnOpen = new JButton(openIcon);
    btnSave = new JButton(saveIcon);
    btnSaveAs = new JButton(saveAsIcon);
    btnCut = new JButton(cutIcon);
    btnCopy = new JButton(copyIcon);
    btnPaste = new JButton(pasteIcon);
    btnFind = new JButton(findIcon);
    btnReplace = new JButton(replaceIcon);
    btnFont = new JButton(fontIcon);
    btnFontColor = new JButton(fontColorIcon);
    
    //toolbar adding buttons
    toolbar.add(btnNew);
    toolbar.add(btnOpen);
    toolbar.add(btnSave);
    toolbar.add(btnSaveAs);
    toolbar.add(btnCut);
    toolbar.add(btnCopy);
    toolbar.add(btnPaste);
    toolbar.add(btnFind);
    toolbar.add(btnReplace);
    toolbar.add(btnFont);
    toolbar.add(btnFontColor);
    
    //menu item
    itmNew = new JMenuItem("New", newIcon);
    itmOpen = new JMenuItem("Open", openIcon);
    itmSave = new JMenuItem("Save", saveIcon);
    itmSaveAs = new JMenuItem("Save As", saveAsIcon);
    itmExit  = new JMenuItem("Exit", exitIcon);
    itmCut = new JMenuItem("Cut", cutIcon);
    itmCopy = new JMenuItem("Copy", copyIcon);
    itmPaste = new JMenuItem("Paste", pasteIcon);
    itmFind = new JMenuItem("Find", findIcon);
    itmReplace = new JMenuItem("Replace", replaceIcon);
    itmFontColor = new JMenuItem("Font Color", fontColorIcon);
    itmFont = new JMenuItem("Font", fontIcon);
    wordWrap = new JCheckBoxMenuItem("Word Wrap");
    
    //adding shortcut
    itmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, 
    ActionEvent.CTRL_MASK));
    itmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, 
    ActionEvent.CTRL_MASK));
    itmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, 
    ActionEvent.CTRL_MASK));
    
    //add menu item
    mnuFile.add(itmNew);
    mnuFile.add(itmOpen);
    mnuFile.add(itmSave);
    mnuFile.add(itmSaveAs);
    mnuFile.addSeparator();
    mnuFile.add(itmExit);
    mnuEdit.add(undoAction);
    mnuEdit.add(redoAction);
    mnuEdit.add(itmCut);
    mnuEdit.add(itmCopy);
    mnuEdit.add(itmPaste);
    mnuEdit.add(itmFind);
    mnuEdit.add(itmReplace);
    mnuFormat.add(wordWrap);
    mnuFormat.add(itmFont);
    mnuFormat.add(itmFontColor);
    
    
    //add meu item to menu bar
    mbar.add(mnuFile);
    mbar.add(mnuEdit);
    mbar.add(mnuFormat);
    mbar.add(mnuHelp);
    
    //add menu bar to frame
    setJMenuBar(mbar);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  private void save() {
    PrintWriter fout = null;
    //int retval = -1; 
     
    try {
      if(filename == null) {
        saveAs();
      }
      else {
        fout = new PrintWriter(new FileWriter(filename));
        String s = mainarea.getText();
        StringTokenizer st = new StringTokenizer(s, 
        System.getProperty("line.separator")); 
        while(st.hasMoreElements()) {
          fout.println(st.nextToken());
        }
      
        JOptionPane.showMessageDialog(rootPane, "File saved");
        fileContent = mainarea.getText();
      }
      
    } catch(IOException e) {
    } finally {
      fout.close();
    }
  }
  private void saveAs() {
    PrintWriter fout = null;
    int retval = -1; 
    
    try {
      retval =  jc.showSaveDialog(this);
      if(retval == JFileChooser.APPROVE_OPTION) {
        if(jc.getSelectedFile().exists()) {
          int option = JOptionPane.showConfirmDialog(rootPane, 
          "Do you want to replace this file?", "Confirmation", 
          JOptionPane.OK_CANCEL_OPTION);
          
          if(option == 0) {
            fout = new PrintWriter(new FileWriter(jc.getSelectedFile()));
            String s = mainarea.getText();
            StringTokenizer st = new StringTokenizer(s, System.getProperty
            ("line.separator")); 
            while(st.hasMoreElements()) {
              fout.println(st.nextToken());
            }
            JOptionPane.showMessageDialog(rootPane, "File saved");
            fileContent = mainarea.getText();
            filename = jc.getSelectedFile().getName();
            setTitle(filename = jc.getSelectedFile().getName());
          }
          else {
            saveAs();
          }
        }
        else {
          fout = new PrintWriter(new FileWriter(jc.getSelectedFile()));
          String s = mainarea.getText();
          StringTokenizer st = new StringTokenizer(s, System.getProperty
          ("line.separator")); 
          while(st.hasMoreElements()) {
            fout.println(st.nextToken());
          }
        
          JOptionPane.showMessageDialog(rootPane, "File saved");
          fileContent = mainarea.getText();
          filename = jc.getSelectedFile().getName();
          setTitle(filename = jc.getSelectedFile().getName());
        }
      }
    } catch(IOException e) {
      e.printStackTrace();
    }
    finally {
      if(fout != null)
      fout.close();
    }
  }
  
  private void open() {
    try {
      int retval = jc.showOpenDialog(this);
      if(retval == JFileChooser.APPROVE_OPTION) {
        mainarea.setText(null);
        Reader in = new FileReader(jc.getSelectedFile());
        char[] buff = new char[100000];
        int nch;
        while((nch = in.read(buff, 0,buff.length)) != -1) {
          mainarea.append(new String(buff, 0, nch));
        }
        filename = jc.getSelectedFile().getName();
        setTitle(filename = jc.getSelectedFile().getName());
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  private void open_new() {
    if(!mainarea.getText().equals("") && !mainarea.getText().equals
    (fileContent)) {
      if(filename == null) {
        int option = JOptionPane.showConfirmDialog(rootPane, 
        "Do you want to save the changes?");
        if(option == 0) {
          saveAs();
          clear();
        }
        else if(option == 2) {
        }
        else {
          clear();
        }
      }
      else {
        int option = JOptionPane.showConfirmDialog(rootPane, 
        "Do you want to save the changes?");
        if(option == 0) {
          save();
          clear();
        }
        else if(option == 2) {
        }
        else {
          clear();
        }
      }
    }
    else {
      clear();
    }
  }
  
  private void clear() {
    mainarea.setText(null);
    setTitle("Untitled Notepad");
    filename = null;
    fileContent = null;
  }
  
  class UndoAction extends AbstractAction {
    
    public UndoAction(ImageIcon undoIcon) {
      super("Undo", undoIcon);
      setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      try {
        undo.undo();
      } catch(CannotUndoException ex) {
        ex.printStackTrace();
      }
      update();
      redoAction.update();
    }
    
    protected void update() {
      if(undo.canUndo()) {
        setEnabled(true);
        putValue(Action.NAME, "Undo");
      }
      else {
        setEnabled(false);
        putValue(Action.NAME, "Undo");
      }
    }
  }
  
  class RedoAction extends AbstractAction {
    
    public RedoAction(ImageIcon redoIcon) {
      super("Redo", redoIcon);
      setEnabled(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      try {
        undo.redo();
      } catch(CannotRedoException ex) {
        ex.printStackTrace();
      }
      update();
      undoAction.update();
    }
    
    protected void update() {
      if(undo.canRedo()) {
        setEnabled(true);
        putValue(Action.NAME, "Redo");
      }
      else {
        setEnabled(false);
        putValue(Action.NAME, "Redo");
      }
    }
  }
  
  public static void main(String[] args) {
    TypeIt jn = new TypeIt(); 
  }
  
  public static JTextArea getArea() {
    return mainarea;
  }
}