// .ui.xml template last modified: 1492639474933
package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class Main_MainUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, org.gwtproject.tutorial.client.Main>, org.gwtproject.tutorial.client.Main.MainUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<style is='custom-style'> paper-icon-item { position: relative; overflow: hidden; } .toolbar { background: #4285f4 !important; } .header { font-size: 200%; margin-left: 50px; background: #4285f4 !important; } .content { padding: 15px; } .add { position: absolute; bottom: 20px; right: 20px; --paper-fab-background: var(--paper-red-500); } </style> <paper-drawer-panel id='{0}'> <div drawer=''> <paper-header-panel mode='seamed'> <paper-toolbar></paper-toolbar> <paper-icon-item id='{1}'> <iron-icon icon='delete' item-icon=''></iron-icon> <div>Clear All</div> <paper-ripple></paper-ripple> </paper-icon-item> <paper-icon-item id='{2}'> <iron-icon icon='clear' item-icon=''></iron-icon> <div>Clear Done</div> <paper-ripple></paper-ripple> </paper-icon-item> <paper-icon-item id='{3}'> <iron-icon icon='settings' item-icon=''></iron-icon> <div>Settings</div> <paper-ripple></paper-ripple> </paper-icon-item> <paper-icon-item id='{4}'> <iron-icon icon='help' item-icon=''></iron-icon> <div>About</div> <paper-ripple></paper-ripple> </paper-icon-item> </paper-header-panel> </div> <div main=''> <paper-header-panel mode='seamed'> <paper-toolbar> <paper-icon-button icon='more-vert' id='{5}' paper-drawer-toggle=''></paper-icon-button> <span>Todo List</span> </paper-toolbar>  <div class='content vertical center-justified layout' id='{6}'></div>  </paper-header-panel> <paper-fab class='add' icon='add' id='{7}' title='add'></paper-fab> </div> </paper-drawer-panel> <paper-dialog class='dialog' entry-animation='face-in-animation' id='{8}' modal=''> <h2>Add Item</h2> <paper-input auto-validate='' error-message='requerid input!' id='{9}' label='Title' requerid=''></paper-input> <div class='textarea-container iron-autogrow-textarea'> <paper-textarea id='{10}' label='Notes'></paper-textarea> </div> <div class='buttons'> <paper-button dialog-dismiss=''>Cancel</paper-button> <paper-button dialog-confirm='' id='{11}'>OK</paper-button> </div> </paper-dialog>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final org.gwtproject.tutorial.client.Main owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.gwtproject.tutorial.client.Main owner;


    public Widgets(final org.gwtproject.tutorial.client.Main owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9(), get_domId10(), get_domId11());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenBundle) GWT.create(org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_drawerPanel();
        get_menuClearAll();
        get_menuClearDone();
        get_menuSettings();
        get_menuAbout();
        get_menu();
        get_content();
        get_addButton();
        get_addItemDialog();
        get_titleInput();
        get_descriptionInput();
        get_confirmAddButton();

        // Detach section.
        __attachRecord__.detach();
      }

      return f_HTMLPanel1;
    }

    /**
     * Getter for drawerPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_drawerPanel() {
      return build_drawerPanel();
    }
    private com.google.gwt.dom.client.Element build_drawerPanel() {
      // Creation section.
      final com.google.gwt.dom.client.Element drawerPanel = new com.google.gwt.uibinder.client.LazyDomElement(get_domId0()).get().cast();
      // Setup section.

      this.owner.drawerPanel = (com.vaadin.polymer.paper.PaperDrawerPanelElement) (Object) drawerPanel;

      return drawerPanel;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for menuClearAll called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_menuClearAll() {
      return build_menuClearAll();
    }
    private com.google.gwt.dom.client.Element build_menuClearAll() {
      // Creation section.
      final com.google.gwt.dom.client.Element menuClearAll = new com.google.gwt.uibinder.client.LazyDomElement(get_domId1()).get().cast();
      // Setup section.

      return menuClearAll;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for menuClearDone called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_menuClearDone() {
      return build_menuClearDone();
    }
    private com.google.gwt.dom.client.Element build_menuClearDone() {
      // Creation section.
      final com.google.gwt.dom.client.Element menuClearDone = new com.google.gwt.uibinder.client.LazyDomElement(get_domId2()).get().cast();
      // Setup section.

      return menuClearDone;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for menuSettings called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_menuSettings() {
      return build_menuSettings();
    }
    private com.google.gwt.dom.client.Element build_menuSettings() {
      // Creation section.
      final com.google.gwt.dom.client.Element menuSettings = new com.google.gwt.uibinder.client.LazyDomElement(get_domId3()).get().cast();
      // Setup section.

      return menuSettings;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for menuAbout called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_menuAbout() {
      return build_menuAbout();
    }
    private com.google.gwt.dom.client.Element build_menuAbout() {
      // Creation section.
      final com.google.gwt.dom.client.Element menuAbout = new com.google.gwt.uibinder.client.LazyDomElement(get_domId4()).get().cast();
      // Setup section.

      return menuAbout;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }

    /**
     * Getter for menu called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_menu() {
      return build_menu();
    }
    private com.google.gwt.dom.client.Element build_menu() {
      // Creation section.
      final com.google.gwt.dom.client.Element menu = new com.google.gwt.uibinder.client.LazyDomElement(get_domId5()).get().cast();
      // Setup section.

      return menu;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId5;
    }

    /**
     * Getter for content called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.DivElement get_content() {
      return build_content();
    }
    private com.google.gwt.dom.client.DivElement build_content() {
      // Creation section.
      final com.google.gwt.dom.client.DivElement content = new com.google.gwt.uibinder.client.LazyDomElement(get_domId6()).get().cast();
      // Setup section.

      this.owner.content = (com.vaadin.polymer.elemental.HTMLElement) (Object) content;

      return content;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId6;
    }

    /**
     * Getter for addButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_addButton() {
      return build_addButton();
    }
    private com.google.gwt.dom.client.Element build_addButton() {
      // Creation section.
      final com.google.gwt.dom.client.Element addButton = new com.google.gwt.uibinder.client.LazyDomElement(get_domId7()).get().cast();
      // Setup section.

      this.owner.addButton = (com.vaadin.polymer.paper.PaperFabElement) (Object) addButton;

      return addButton;
    }

    /**
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId7;
    private java.lang.String get_domId7() {
      return domId7;
    }
    private java.lang.String build_domId7() {
      // Creation section.
      domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId7;
    }

    /**
     * Getter for addItemDialog called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_addItemDialog() {
      return build_addItemDialog();
    }
    private com.google.gwt.dom.client.Element build_addItemDialog() {
      // Creation section.
      final com.google.gwt.dom.client.Element addItemDialog = new com.google.gwt.uibinder.client.LazyDomElement(get_domId8()).get().cast();
      // Setup section.

      this.owner.addItemDialog = (com.vaadin.polymer.paper.PaperDialogElement) (Object) addItemDialog;

      return addItemDialog;
    }

    /**
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId8;
    private java.lang.String get_domId8() {
      return domId8;
    }
    private java.lang.String build_domId8() {
      // Creation section.
      domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId8;
    }

    /**
     * Getter for titleInput called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_titleInput() {
      return build_titleInput();
    }
    private com.google.gwt.dom.client.Element build_titleInput() {
      // Creation section.
      final com.google.gwt.dom.client.Element titleInput = new com.google.gwt.uibinder.client.LazyDomElement(get_domId9()).get().cast();
      // Setup section.

      this.owner.titleInput = (com.vaadin.polymer.paper.PaperInputElement) (Object) titleInput;

      return titleInput;
    }

    /**
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId9;
    private java.lang.String get_domId9() {
      return domId9;
    }
    private java.lang.String build_domId9() {
      // Creation section.
      domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId9;
    }

    /**
     * Getter for descriptionInput called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_descriptionInput() {
      return build_descriptionInput();
    }
    private com.google.gwt.dom.client.Element build_descriptionInput() {
      // Creation section.
      final com.google.gwt.dom.client.Element descriptionInput = new com.google.gwt.uibinder.client.LazyDomElement(get_domId10()).get().cast();
      // Setup section.

      this.owner.descriptionInput = (com.vaadin.polymer.paper.PaperTextareaElement) (Object) descriptionInput;

      return descriptionInput;
    }

    /**
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId10;
    private java.lang.String get_domId10() {
      return domId10;
    }
    private java.lang.String build_domId10() {
      // Creation section.
      domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId10;
    }

    /**
     * Getter for confirmAddButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.Element get_confirmAddButton() {
      return build_confirmAddButton();
    }
    private com.google.gwt.dom.client.Element build_confirmAddButton() {
      // Creation section.
      final com.google.gwt.dom.client.Element confirmAddButton = new com.google.gwt.uibinder.client.LazyDomElement(get_domId11()).get().cast();
      // Setup section.

      return confirmAddButton;
    }

    /**
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId11;
    private java.lang.String get_domId11() {
      return domId11;
    }
    private java.lang.String build_domId11() {
      // Creation section.
      domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId11;
    }
  }
}
