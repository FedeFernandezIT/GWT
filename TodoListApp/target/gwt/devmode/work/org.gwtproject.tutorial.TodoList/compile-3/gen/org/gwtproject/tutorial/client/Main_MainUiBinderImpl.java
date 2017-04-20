// .ui.xml template last modified: 1492558343578
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
    @Template("")
    SafeHtml html1();
     
    @Template("")
    SafeHtml html2();
     
    @Template("")
    SafeHtml html3();
     
    @Template("<span id='{0}'></span> <div>Clear All</div> <span id='{1}'></span>")
    SafeHtml html4(String arg0, String arg1);
     
    @Template("")
    SafeHtml html5();
     
    @Template("")
    SafeHtml html6();
     
    @Template("<span id='{0}'></span> <div>Clear Done</div> <span id='{1}'></span>")
    SafeHtml html7(String arg0, String arg1);
     
    @Template("")
    SafeHtml html8();
     
    @Template("")
    SafeHtml html9();
     
    @Template("<span id='{0}'></span> <div>Settings</div> <span id='{1}'></span>")
    SafeHtml html10(String arg0, String arg1);
     
    @Template("")
    SafeHtml html11();
     
    @Template("")
    SafeHtml html12();
     
    @Template("<span id='{0}'></span> <div>About</div> <span id='{1}'></span>")
    SafeHtml html13(String arg0, String arg1);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span>")
    SafeHtml html14(String arg0, String arg1, String arg2, String arg3, String arg4);
     
    @Template("")
    SafeHtml html15();
     
    @Template("<span id='{0}'></span> <span class='{1}'>Todo List</span>")
    SafeHtml html16(String arg0, String arg1);
     
    @Template("")
    SafeHtml html17();
     
    @Template("<span id='{0}'></span>  <span id='{1}'></span>")
    SafeHtml html18(String arg0, String arg1);
     
    @Template("")
    SafeHtml html19();
     
    @Template("<div drawer=''> <span id='{0}'></span> </div>  <div main=''> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html20(String arg0, String arg1, String arg2);
     
    @Template("")
    SafeHtml html21();
     
    @Template("")
    SafeHtml html22();
     
    @Template("Cancel")
    SafeHtml html23();
     
    @Template("OK")
    SafeHtml html24();
     
    @Template("<h2>Add Item</h2> <span id='{0}'></span> <div class='textarea-container iron-autogrow-textarea'> <span id='{1}'></span> </div> <div class='buttons'> <span id='{2}'></span> <span id='{3}'></span> </div>")
    SafeHtml html25(String arg0, String arg1, String arg2, String arg3);
     
    @Template("<style is='custom-style'> .add { position: absolute; bottom: 20px; right: 20px; --paper-fab-background: var(--paper-red-500); } </style>  <span id='{0}'></span>  <span id='{1}'></span>")
    SafeHtml html26(String arg0, String arg1);
     
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


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAddButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onConfirmAddButtonClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.gwtproject.tutorial.client.Main owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId13();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId14();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId17();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId16();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId18();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId15();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId19();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId21();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId22();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId23();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId24();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId20();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId13Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId14Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId17Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId16Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId18Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId15Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId19Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId21Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId22Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId23Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId24Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId20Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4(get_domId4(), get_domId5());
    }
    SafeHtml template_html5() {
      return template.html5();
    }
    SafeHtml template_html6() {
      return template.html6();
    }
    SafeHtml template_html7() {
      return template.html7(get_domId7(), get_domId8());
    }
    SafeHtml template_html8() {
      return template.html8();
    }
    SafeHtml template_html9() {
      return template.html9();
    }
    SafeHtml template_html10() {
      return template.html10(get_domId10(), get_domId11());
    }
    SafeHtml template_html11() {
      return template.html11();
    }
    SafeHtml template_html12() {
      return template.html12();
    }
    SafeHtml template_html13() {
      return template.html13(get_domId13(), get_domId14());
    }
    SafeHtml template_html14() {
      return template.html14(get_domId2(), get_domId3(), get_domId6(), get_domId9(), get_domId12());
    }
    SafeHtml template_html15() {
      return template.html15();
    }
    SafeHtml template_html16() {
      return template.html16(get_domId17(), "" + get_style().header() + "");
    }
    SafeHtml template_html17() {
      return template.html17();
    }
    SafeHtml template_html18() {
      return template.html18(get_domId16(), get_domId18());
    }
    SafeHtml template_html19() {
      return template.html19();
    }
    SafeHtml template_html20() {
      return template.html20(get_domId1(), get_domId15(), get_domId19());
    }
    SafeHtml template_html21() {
      return template.html21();
    }
    SafeHtml template_html22() {
      return template.html22();
    }
    SafeHtml template_html23() {
      return template.html23();
    }
    SafeHtml template_html24() {
      return template.html24();
    }
    SafeHtml template_html25() {
      return template.html25(get_domId21(), get_domId22(), get_domId23(), get_domId24());
    }
    SafeHtml template_html26() {
      return template.html26(get_domId0(), get_domId20());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
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
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenCss_style style;
    private org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html26().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId20Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_drawerPanel(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_addItemDialog(), get_domId20Element().get());

      return f_HTMLPanel1;
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
     * Getter for drawerPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.vaadin.polymer.paper.widget.PaperDrawerPanel get_drawerPanel() {
      return build_drawerPanel();
    }
    private com.vaadin.polymer.paper.widget.PaperDrawerPanel build_drawerPanel() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperDrawerPanel drawerPanel = new com.vaadin.polymer.paper.widget.PaperDrawerPanel(template_html20().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(drawerPanel.getElement());

        get_domId1Element().get();
        get_domId15Element().get();
        get_domId19Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      drawerPanel.addAndReplaceElement(get_f_PaperHeaderPanel2(), get_domId1Element().get());
      drawerPanel.addAndReplaceElement(get_f_PaperHeaderPanel12(), get_domId15Element().get());
      drawerPanel.addAndReplaceElement(get_addButton(), get_domId19Element().get());

      this.owner.drawerPanel = drawerPanel;

      return drawerPanel;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_PaperHeaderPanel2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.vaadin.polymer.paper.widget.PaperHeaderPanel get_f_PaperHeaderPanel2() {
      return build_f_PaperHeaderPanel2();
    }
    private com.vaadin.polymer.paper.widget.PaperHeaderPanel build_f_PaperHeaderPanel2() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperHeaderPanel f_PaperHeaderPanel2 = new com.vaadin.polymer.paper.widget.PaperHeaderPanel(template_html14().asString());
      // Setup section.
      f_PaperHeaderPanel2.setMode("seamed");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_PaperHeaderPanel2.getElement());

        get_domId2Element().get();
        get_domId3Element().get();
        get_domId6Element().get();
        get_domId9Element().get();
        get_domId12Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_PaperHeaderPanel2.addAndReplaceElement(get_f_PaperToolbar3(), get_domId2Element().get());
      f_PaperHeaderPanel2.addAndReplaceElement(get_menuClearAll(), get_domId3Element().get());
      f_PaperHeaderPanel2.addAndReplaceElement(get_menuClearDone(), get_domId6Element().get());
      f_PaperHeaderPanel2.addAndReplaceElement(get_menuSettings(), get_domId9Element().get());
      f_PaperHeaderPanel2.addAndReplaceElement(get_menuAbout(), get_domId12Element().get());

      return f_PaperHeaderPanel2;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for f_PaperToolbar3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.vaadin.polymer.paper.widget.PaperToolbar get_f_PaperToolbar3() {
      return build_f_PaperToolbar3();
    }
    private com.vaadin.polymer.paper.widget.PaperToolbar build_f_PaperToolbar3() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperToolbar f_PaperToolbar3 = new com.vaadin.polymer.paper.widget.PaperToolbar(template_html1().asString());
      // Setup section.

      return f_PaperToolbar3;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for menuClearAll called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.vaadin.polymer.paper.widget.PaperIconItem get_menuClearAll() {
      return build_menuClearAll();
    }
    private com.vaadin.polymer.paper.widget.PaperIconItem build_menuClearAll() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperIconItem menuClearAll = new com.vaadin.polymer.paper.widget.PaperIconItem(template_html4().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(menuClearAll.getElement());

        get_domId4Element().get();
        get_domId5Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      menuClearAll.addAndReplaceElement(get_f_IronIcon4(), get_domId4Element().get());
      menuClearAll.addAndReplaceElement(get_f_PaperRipple5(), get_domId5Element().get());

      return menuClearAll;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_IronIcon4 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.iron.widget.IronIcon get_f_IronIcon4() {
      return build_f_IronIcon4();
    }
    private com.vaadin.polymer.iron.widget.IronIcon build_f_IronIcon4() {
      // Creation section.
      final com.vaadin.polymer.iron.widget.IronIcon f_IronIcon4 = new com.vaadin.polymer.iron.widget.IronIcon(template_html2().asString());
      // Setup section.
      f_IronIcon4.setIcon("delete");
      f_IronIcon4.setAttributes("item-icon");

      return f_IronIcon4;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.

      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_PaperRipple5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.paper.widget.PaperRipple get_f_PaperRipple5() {
      return build_f_PaperRipple5();
    }
    private com.vaadin.polymer.paper.widget.PaperRipple build_f_PaperRipple5() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperRipple f_PaperRipple5 = new com.vaadin.polymer.paper.widget.PaperRipple(template_html3().asString());
      // Setup section.

      return f_PaperRipple5;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.

      return domId5Element;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for menuClearDone called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.vaadin.polymer.paper.widget.PaperIconItem get_menuClearDone() {
      return build_menuClearDone();
    }
    private com.vaadin.polymer.paper.widget.PaperIconItem build_menuClearDone() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperIconItem menuClearDone = new com.vaadin.polymer.paper.widget.PaperIconItem(template_html7().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(menuClearDone.getElement());

        get_domId7Element().get();
        get_domId8Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      menuClearDone.addAndReplaceElement(get_f_IronIcon6(), get_domId7Element().get());
      menuClearDone.addAndReplaceElement(get_f_PaperRipple7(), get_domId8Element().get());

      return menuClearDone;
    }

    /**
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_IronIcon6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.iron.widget.IronIcon get_f_IronIcon6() {
      return build_f_IronIcon6();
    }
    private com.vaadin.polymer.iron.widget.IronIcon build_f_IronIcon6() {
      // Creation section.
      final com.vaadin.polymer.iron.widget.IronIcon f_IronIcon6 = new com.vaadin.polymer.iron.widget.IronIcon(template_html5().asString());
      // Setup section.
      f_IronIcon6.setIcon("clear");
      f_IronIcon6.setAttributes("item-icon");

      return f_IronIcon6;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId7Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId7Element() {
      return domId7Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId7Element() {
      // Creation section.
      domId7Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId7());
      // Setup section.

      return domId7Element;
    }

    /**
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_PaperRipple7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.paper.widget.PaperRipple get_f_PaperRipple7() {
      return build_f_PaperRipple7();
    }
    private com.vaadin.polymer.paper.widget.PaperRipple build_f_PaperRipple7() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperRipple f_PaperRipple7 = new com.vaadin.polymer.paper.widget.PaperRipple(template_html6().asString());
      // Setup section.

      return f_PaperRipple7;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId8Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId8Element() {
      return domId8Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId8Element() {
      // Creation section.
      domId8Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId8());
      // Setup section.

      return domId8Element;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.

      return domId6Element;
    }

    /**
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
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
     * Getter for menuSettings called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.vaadin.polymer.paper.widget.PaperIconItem get_menuSettings() {
      return build_menuSettings();
    }
    private com.vaadin.polymer.paper.widget.PaperIconItem build_menuSettings() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperIconItem menuSettings = new com.vaadin.polymer.paper.widget.PaperIconItem(template_html10().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(menuSettings.getElement());

        get_domId10Element().get();
        get_domId11Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      menuSettings.addAndReplaceElement(get_f_IronIcon8(), get_domId10Element().get());
      menuSettings.addAndReplaceElement(get_f_PaperRipple9(), get_domId11Element().get());

      return menuSettings;
    }

    /**
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_IronIcon8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.iron.widget.IronIcon get_f_IronIcon8() {
      return build_f_IronIcon8();
    }
    private com.vaadin.polymer.iron.widget.IronIcon build_f_IronIcon8() {
      // Creation section.
      final com.vaadin.polymer.iron.widget.IronIcon f_IronIcon8 = new com.vaadin.polymer.iron.widget.IronIcon(template_html8().asString());
      // Setup section.
      f_IronIcon8.setIcon("settings");
      f_IronIcon8.setAttributes("item-icon");

      return f_IronIcon8;
    }

    /**
     * Getter for domId10Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId10Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId10Element() {
      return domId10Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId10Element() {
      // Creation section.
      domId10Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId10());
      // Setup section.

      return domId10Element;
    }

    /**
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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

    /**
     * Getter for f_PaperRipple9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.paper.widget.PaperRipple get_f_PaperRipple9() {
      return build_f_PaperRipple9();
    }
    private com.vaadin.polymer.paper.widget.PaperRipple build_f_PaperRipple9() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperRipple f_PaperRipple9 = new com.vaadin.polymer.paper.widget.PaperRipple(template_html9().asString());
      // Setup section.

      return f_PaperRipple9;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId11Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId11Element() {
      return domId11Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId11Element() {
      // Creation section.
      domId11Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId11());
      // Setup section.

      return domId11Element;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId9Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId9Element() {
      return domId9Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId9Element() {
      // Creation section.
      domId9Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId9());
      // Setup section.

      return domId9Element;
    }

    /**
     * Getter for domId12 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
     */
    private java.lang.String domId12;
    private java.lang.String get_domId12() {
      return domId12;
    }
    private java.lang.String build_domId12() {
      // Creation section.
      domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId12;
    }

    /**
     * Getter for menuAbout called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.vaadin.polymer.paper.widget.PaperIconItem get_menuAbout() {
      return build_menuAbout();
    }
    private com.vaadin.polymer.paper.widget.PaperIconItem build_menuAbout() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperIconItem menuAbout = new com.vaadin.polymer.paper.widget.PaperIconItem(template_html13().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(menuAbout.getElement());

        get_domId13Element().get();
        get_domId14Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      menuAbout.addAndReplaceElement(get_f_IronIcon10(), get_domId13Element().get());
      menuAbout.addAndReplaceElement(get_f_PaperRipple11(), get_domId14Element().get());

      return menuAbout;
    }

    /**
     * Getter for domId13 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
     */
    private java.lang.String domId13;
    private java.lang.String get_domId13() {
      return domId13;
    }
    private java.lang.String build_domId13() {
      // Creation section.
      domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId13;
    }

    /**
     * Getter for f_IronIcon10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.iron.widget.IronIcon get_f_IronIcon10() {
      return build_f_IronIcon10();
    }
    private com.vaadin.polymer.iron.widget.IronIcon build_f_IronIcon10() {
      // Creation section.
      final com.vaadin.polymer.iron.widget.IronIcon f_IronIcon10 = new com.vaadin.polymer.iron.widget.IronIcon(template_html11().asString());
      // Setup section.
      f_IronIcon10.setIcon("help");
      f_IronIcon10.setAttributes("item-icon");

      return f_IronIcon10;
    }

    /**
     * Getter for domId13Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId13Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId13Element() {
      return domId13Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId13Element() {
      // Creation section.
      domId13Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId13());
      // Setup section.

      return domId13Element;
    }

    /**
     * Getter for domId14 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
     */
    private java.lang.String domId14;
    private java.lang.String get_domId14() {
      return domId14;
    }
    private java.lang.String build_domId14() {
      // Creation section.
      domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId14;
    }

    /**
     * Getter for f_PaperRipple11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.paper.widget.PaperRipple get_f_PaperRipple11() {
      return build_f_PaperRipple11();
    }
    private com.vaadin.polymer.paper.widget.PaperRipple build_f_PaperRipple11() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperRipple f_PaperRipple11 = new com.vaadin.polymer.paper.widget.PaperRipple(template_html12().asString());
      // Setup section.

      return f_PaperRipple11;
    }

    /**
     * Getter for domId14Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId14Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId14Element() {
      return domId14Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId14Element() {
      // Creation section.
      domId14Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId14());
      // Setup section.

      return domId14Element;
    }

    /**
     * Getter for domId12Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId12Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId12Element() {
      return domId12Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId12Element() {
      // Creation section.
      domId12Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId12());
      // Setup section.

      return domId12Element;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId15 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId15;
    private java.lang.String get_domId15() {
      return domId15;
    }
    private java.lang.String build_domId15() {
      // Creation section.
      domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId15;
    }

    /**
     * Getter for f_PaperHeaderPanel12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.vaadin.polymer.paper.widget.PaperHeaderPanel get_f_PaperHeaderPanel12() {
      return build_f_PaperHeaderPanel12();
    }
    private com.vaadin.polymer.paper.widget.PaperHeaderPanel build_f_PaperHeaderPanel12() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperHeaderPanel f_PaperHeaderPanel12 = new com.vaadin.polymer.paper.widget.PaperHeaderPanel(template_html18().asString());
      // Setup section.
      f_PaperHeaderPanel12.setMode("seamed");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_PaperHeaderPanel12.getElement());

        get_domId16Element().get();
        get_domId18Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_PaperHeaderPanel12.addAndReplaceElement(get_f_PaperToolbar13(), get_domId16Element().get());
      f_PaperHeaderPanel12.addAndReplaceElement(get_content(), get_domId18Element().get());

      return f_PaperHeaderPanel12;
    }

    /**
     * Getter for domId16 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
     */
    private java.lang.String domId16;
    private java.lang.String get_domId16() {
      return domId16;
    }
    private java.lang.String build_domId16() {
      // Creation section.
      domId16 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId16;
    }

    /**
     * Getter for f_PaperToolbar13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.vaadin.polymer.paper.widget.PaperToolbar get_f_PaperToolbar13() {
      return build_f_PaperToolbar13();
    }
    private com.vaadin.polymer.paper.widget.PaperToolbar build_f_PaperToolbar13() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperToolbar f_PaperToolbar13 = new com.vaadin.polymer.paper.widget.PaperToolbar(template_html16().asString());
      // Setup section.
      f_PaperToolbar13.addStyleName("" + get_style().toolbar() + "");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_PaperToolbar13.getElement());

        get_domId17Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_PaperToolbar13.addAndReplaceElement(get_menu(), get_domId17Element().get());

      return f_PaperToolbar13;
    }

    /**
     * Getter for domId17 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
     */
    private java.lang.String domId17;
    private java.lang.String get_domId17() {
      return domId17;
    }
    private java.lang.String build_domId17() {
      // Creation section.
      domId17 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId17;
    }

    /**
     * Getter for menu called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.vaadin.polymer.paper.widget.PaperIconButton get_menu() {
      return build_menu();
    }
    private com.vaadin.polymer.paper.widget.PaperIconButton build_menu() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperIconButton menu = new com.vaadin.polymer.paper.widget.PaperIconButton(template_html15().asString());
      // Setup section.
      menu.setIcon("more-vert");
      menu.setAttributes("paper-drawer-toggle");

      return menu;
    }

    /**
     * Getter for domId17Element called 2 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId17Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId17Element() {
      return domId17Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId17Element() {
      // Creation section.
      domId17Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId17());
      // Setup section.

      return domId17Element;
    }

    /**
     * Getter for domId16Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId16Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId16Element() {
      return domId16Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId16Element() {
      // Creation section.
      domId16Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId16());
      // Setup section.

      return domId16Element;
    }

    /**
     * Getter for domId18 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
     */
    private java.lang.String domId18;
    private java.lang.String get_domId18() {
      return domId18;
    }
    private java.lang.String build_domId18() {
      // Creation section.
      domId18 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId18;
    }

    /**
     * Getter for content called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_content() {
      return build_content();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_content() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel content = new com.google.gwt.user.client.ui.HTMLPanel(template_html17().asString());
      // Setup section.
      content.addStyleName("" + get_style().content() + "");
      content.addStyleName("vertical");
      content.addStyleName("center-justified");
      content.addStyleName("layout");

      this.owner.content = content;

      return content;
    }

    /**
     * Getter for domId18Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId18Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId18Element() {
      return domId18Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId18Element() {
      // Creation section.
      domId18Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId18());
      // Setup section.

      return domId18Element;
    }

    /**
     * Getter for domId15Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId15Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId15Element() {
      return domId15Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId15Element() {
      // Creation section.
      domId15Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId15());
      // Setup section.

      return domId15Element;
    }

    /**
     * Getter for domId19 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId19;
    private java.lang.String get_domId19() {
      return domId19;
    }
    private java.lang.String build_domId19() {
      // Creation section.
      domId19 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId19;
    }

    /**
     * Getter for addButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.vaadin.polymer.paper.widget.PaperFab get_addButton() {
      return build_addButton();
    }
    private com.vaadin.polymer.paper.widget.PaperFab build_addButton() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperFab addButton = new com.vaadin.polymer.paper.widget.PaperFab(template_html19().asString());
      // Setup section.
      addButton.addStyleName("add");
      addButton.setIcon("add");
      addButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return addButton;
    }

    /**
     * Getter for domId19Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId19Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId19Element() {
      return domId19Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId19Element() {
      // Creation section.
      domId19Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId19());
      // Setup section.

      return domId19Element;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId20 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId20;
    private java.lang.String get_domId20() {
      return domId20;
    }
    private java.lang.String build_domId20() {
      // Creation section.
      domId20 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId20;
    }

    /**
     * Getter for addItemDialog called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.vaadin.polymer.paper.widget.PaperDialog get_addItemDialog() {
      return build_addItemDialog();
    }
    private com.vaadin.polymer.paper.widget.PaperDialog build_addItemDialog() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperDialog addItemDialog = new com.vaadin.polymer.paper.widget.PaperDialog(template_html25().asString());
      // Setup section.
      addItemDialog.addStyleName("" + get_style().dialog() + "");
      addItemDialog.setEntryAnimation("fade-in-animation");
      addItemDialog.setModal(true);

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(addItemDialog.getElement());

        get_domId21Element().get();
        get_domId22Element().get();
        get_domId23Element().get();
        get_domId24Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      addItemDialog.addAndReplaceElement(get_titleInput(), get_domId21Element().get());
      addItemDialog.addAndReplaceElement(get_descriptionInput(), get_domId22Element().get());
      addItemDialog.addAndReplaceElement(get_f_PaperButton14(), get_domId23Element().get());
      addItemDialog.addAndReplaceElement(get_confirmAddButton(), get_domId24Element().get());

      this.owner.addItemDialog = addItemDialog;

      return addItemDialog;
    }

    /**
     * Getter for domId21 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId21;
    private java.lang.String get_domId21() {
      return domId21;
    }
    private java.lang.String build_domId21() {
      // Creation section.
      domId21 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId21;
    }

    /**
     * Getter for titleInput called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.vaadin.polymer.paper.widget.PaperInput get_titleInput() {
      return build_titleInput();
    }
    private com.vaadin.polymer.paper.widget.PaperInput build_titleInput() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperInput titleInput = new com.vaadin.polymer.paper.widget.PaperInput(template_html21().asString());
      // Setup section.
      titleInput.setErrorMessage("required input!");
      titleInput.setAutoValidate(true);
      titleInput.setLabel("Title");
      titleInput.setRequired(true);

      this.owner.titleInput = titleInput;

      return titleInput;
    }

    /**
     * Getter for domId21Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId21Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId21Element() {
      return domId21Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId21Element() {
      // Creation section.
      domId21Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId21());
      // Setup section.

      return domId21Element;
    }

    /**
     * Getter for domId22 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId22;
    private java.lang.String get_domId22() {
      return domId22;
    }
    private java.lang.String build_domId22() {
      // Creation section.
      domId22 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId22;
    }

    /**
     * Getter for descriptionInput called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.vaadin.polymer.paper.widget.PaperTextarea get_descriptionInput() {
      return build_descriptionInput();
    }
    private com.vaadin.polymer.paper.widget.PaperTextarea build_descriptionInput() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperTextarea descriptionInput = new com.vaadin.polymer.paper.widget.PaperTextarea(template_html22().asString());
      // Setup section.
      descriptionInput.setLabel("Notes");

      this.owner.descriptionInput = descriptionInput;

      return descriptionInput;
    }

    /**
     * Getter for domId22Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId22Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId22Element() {
      return domId22Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId22Element() {
      // Creation section.
      domId22Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId22());
      // Setup section.

      return domId22Element;
    }

    /**
     * Getter for domId23 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId23;
    private java.lang.String get_domId23() {
      return domId23;
    }
    private java.lang.String build_domId23() {
      // Creation section.
      domId23 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId23;
    }

    /**
     * Getter for f_PaperButton14 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.vaadin.polymer.paper.widget.PaperButton get_f_PaperButton14() {
      return build_f_PaperButton14();
    }
    private com.vaadin.polymer.paper.widget.PaperButton build_f_PaperButton14() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperButton f_PaperButton14 = new com.vaadin.polymer.paper.widget.PaperButton(template_html23().asString());
      // Setup section.
      f_PaperButton14.setAttributes("dialog-dismiss");

      return f_PaperButton14;
    }

    /**
     * Getter for domId23Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId23Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId23Element() {
      return domId23Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId23Element() {
      // Creation section.
      domId23Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId23());
      // Setup section.

      return domId23Element;
    }

    /**
     * Getter for domId24 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId24;
    private java.lang.String get_domId24() {
      return domId24;
    }
    private java.lang.String build_domId24() {
      // Creation section.
      domId24 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId24;
    }

    /**
     * Getter for confirmAddButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.vaadin.polymer.paper.widget.PaperButton get_confirmAddButton() {
      return build_confirmAddButton();
    }
    private com.vaadin.polymer.paper.widget.PaperButton build_confirmAddButton() {
      // Creation section.
      final com.vaadin.polymer.paper.widget.PaperButton confirmAddButton = new com.vaadin.polymer.paper.widget.PaperButton(template_html24().asString());
      // Setup section.
      confirmAddButton.setAttributes("dialog-confirm");
      confirmAddButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      return confirmAddButton;
    }

    /**
     * Getter for domId24Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId24Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId24Element() {
      return domId24Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId24Element() {
      // Creation section.
      domId24Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId24());
      // Setup section.

      return domId24Element;
    }

    /**
     * Getter for domId20Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId20Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId20Element() {
      return domId20Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId20Element() {
      // Creation section.
      domId20Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId20());
      // Setup section.

      return domId20Element;
    }
  }
}
