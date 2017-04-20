package org.gwtproject.tutorial.client;

public class Main_MainUiBinderImpl_TemplateImpl implements org.gwtproject.tutorial.client.Main_MainUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4,java.lang.String arg5,java.lang.String arg6,java.lang.String arg7,java.lang.String arg8,java.lang.String arg9,java.lang.String arg10,java.lang.String arg11) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<style is='custom-style'> paper-icon-item { position: relative; overflow: hidden; } .toolbar { background: #4285f4 !important; } .header { font-size: 200%; margin-left: 50px; background: #4285f4 !important; } .content { padding: 15px; } .add { position: absolute; bottom: 20px; right: 20px; --paper-fab-background: var(--paper-red-500); } </style> <paper-drawer-panel id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'> <div drawer=''> <paper-header-panel mode='seamed'> <paper-toolbar></paper-toolbar> <paper-icon-item id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'> <iron-icon icon='delete' item-icon=''></iron-icon> <div>Clear All</div> <paper-ripple></paper-ripple> </paper-icon-item> <paper-icon-item id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("'> <iron-icon icon='clear' item-icon=''></iron-icon> <div>Clear Done</div> <paper-ripple></paper-ripple> </paper-icon-item> <paper-icon-item id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
    sb.append("'> <iron-icon icon='settings' item-icon=''></iron-icon> <div>Settings</div> <paper-ripple></paper-ripple> </paper-icon-item> <paper-icon-item id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
    sb.append("'> <iron-icon icon='help' item-icon=''></iron-icon> <div>About</div> <paper-ripple></paper-ripple> </paper-icon-item> </paper-header-panel> </div> <div main=''> <paper-header-panel mode='seamed'> <paper-toolbar> <paper-icon-button icon='more-vert' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg5));
    sb.append("' paper-drawer-toggle=''></paper-icon-button> <span>Todo List</span> </paper-toolbar>  <div class='content vertical center-justified layout' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg6));
    sb.append("'></div>  </paper-header-panel> <paper-fab class='add' icon='add' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg7));
    sb.append("' title='add'></paper-fab> </div> </paper-drawer-panel> <paper-dialog class='dialog' entry-animation='face-in-animation' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg8));
    sb.append("' modal=''> <h2>Add Item</h2> <paper-input auto-validate='' error-message='requerid input!' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg9));
    sb.append("' label='Title' requerid=''></paper-input> <div class='textarea-container iron-autogrow-textarea'> <paper-textarea id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg10));
    sb.append("' label='Notes'></paper-textarea> </div> <div class='buttons'> <paper-button dialog-dismiss=''>Cancel</paper-button> <paper-button dialog-confirm='' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg11));
    sb.append("'>OK</paper-button> </div> </paper-dialog>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
