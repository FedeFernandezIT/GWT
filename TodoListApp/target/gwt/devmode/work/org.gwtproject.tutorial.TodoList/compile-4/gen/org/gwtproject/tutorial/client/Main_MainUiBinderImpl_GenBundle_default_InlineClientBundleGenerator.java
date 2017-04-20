package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Main_MainUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenBundle {
  private static Main_MainUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new Main_MainUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("paper-icon-item {\n  position : " + ("relative")  + ";\n  overflow : " + ("hidden")  + ";\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-toolbar {\n  background : " + ("#4285f4")  + " !important;\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-header {\n  font-size : " + ("200%")  + ";\n  margin-right : " + ("50px")  + ";\n  background : " + ("#4285f4")  + " !important;\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-content {\n  padding : " + ("15px")  + ";\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-dialog {\n  min-width : " + ("40%")  + ";\n}\n")) : (("paper-icon-item {\n  position : " + ("relative")  + ";\n  overflow : " + ("hidden")  + ";\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-toolbar {\n  background : " + ("#4285f4")  + " !important;\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-header {\n  font-size : " + ("200%")  + ";\n  margin-left : " + ("50px")  + ";\n  background : " + ("#4285f4")  + " !important;\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-content {\n  padding : " + ("15px")  + ";\n}\n.org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-dialog {\n  min-width : " + ("40%")  + ";\n}\n"));
      }
      public java.lang.String content() {
        return "org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-content";
      }
      public java.lang.String dialog() {
        return "org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-dialog";
      }
      public java.lang.String header() {
        return "org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-header";
      }
      public java.lang.String toolbar() {
        return "org-gwtproject-tutorial-client-Main_MainUiBinderImpl_GenCss_style-toolbar";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.gwtproject.tutorial.client.Main_MainUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
