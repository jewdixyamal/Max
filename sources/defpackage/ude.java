package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ude  reason: default package */
public final class ude extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public ude(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        tde tde = new tde(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z2 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        } else if (name2.equals("group")) {
                            tde.b = 0;
                            tde.c = 0;
                            tde.d = 0;
                            tde.e = 0;
                            tde.f = true;
                            tde.g = true;
                        } else if (name2.equals("item")) {
                            if (!tde.h) {
                                k7 k7Var = tde.z;
                                if (k7Var == null || !k7Var.a()) {
                                    tde.h = true;
                                    tde.b(tde.a.add(tde.b, tde.i, tde.j, tde.k));
                                } else {
                                    tde.h = true;
                                    tde.b(tde.a.addSubMenu(tde.b, tde.i, tde.j, tde.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z = true;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    ude ude = tde.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = ude.c.obtainStyledAttributes(attributeSet2, p3c.MenuGroup);
                        tde.b = obtainStyledAttributes.getResourceId(p3c.MenuGroup_android_id, 0);
                        tde.c = obtainStyledAttributes.getInt(p3c.MenuGroup_android_menuCategory, 0);
                        tde.d = obtainStyledAttributes.getInt(p3c.MenuGroup_android_orderInCategory, 0);
                        tde.e = obtainStyledAttributes.getInt(p3c.MenuGroup_android_checkableBehavior, 0);
                        tde.f = obtainStyledAttributes.getBoolean(p3c.MenuGroup_android_visible, true);
                        tde.g = obtainStyledAttributes.getBoolean(p3c.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = ude.c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, p3c.MenuItem);
                        tde.i = obtainStyledAttributes2.getResourceId(p3c.MenuItem_android_id, 0);
                        tde.j = (obtainStyledAttributes2.getInt(p3c.MenuItem_android_orderInCategory, tde.d) & 65535) | (obtainStyledAttributes2.getInt(p3c.MenuItem_android_menuCategory, tde.c) & -65536);
                        tde.k = obtainStyledAttributes2.getText(p3c.MenuItem_android_title);
                        tde.l = obtainStyledAttributes2.getText(p3c.MenuItem_android_titleCondensed);
                        tde.m = obtainStyledAttributes2.getResourceId(p3c.MenuItem_android_icon, 0);
                        String string = obtainStyledAttributes2.getString(p3c.MenuItem_android_alphabeticShortcut);
                        tde.n = string == null ? 0 : string.charAt(0);
                        tde.o = obtainStyledAttributes2.getInt(p3c.MenuItem_alphabeticModifiers, 4096);
                        String string2 = obtainStyledAttributes2.getString(p3c.MenuItem_android_numericShortcut);
                        tde.p = string2 == null ? 0 : string2.charAt(0);
                        tde.q = obtainStyledAttributes2.getInt(p3c.MenuItem_numericModifiers, 4096);
                        if (obtainStyledAttributes2.hasValue(p3c.MenuItem_android_checkable)) {
                            tde.r = obtainStyledAttributes2.getBoolean(p3c.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            tde.r = tde.e;
                        }
                        tde.s = obtainStyledAttributes2.getBoolean(p3c.MenuItem_android_checked, false);
                        tde.t = obtainStyledAttributes2.getBoolean(p3c.MenuItem_android_visible, tde.f);
                        tde.u = obtainStyledAttributes2.getBoolean(p3c.MenuItem_android_enabled, tde.g);
                        tde.v = obtainStyledAttributes2.getInt(p3c.MenuItem_showAsAction, -1);
                        tde.y = obtainStyledAttributes2.getString(p3c.MenuItem_android_onClick);
                        tde.w = obtainStyledAttributes2.getResourceId(p3c.MenuItem_actionLayout, 0);
                        tde.x = obtainStyledAttributes2.getString(p3c.MenuItem_actionViewClass);
                        String string3 = obtainStyledAttributes2.getString(p3c.MenuItem_actionProviderClass);
                        if (string3 != null && tde.w == 0 && tde.x == null) {
                            tde.z = (k7) tde.a(string3, f, ude.b);
                        } else {
                            tde.z = null;
                        }
                        tde.A = obtainStyledAttributes2.getText(p3c.MenuItem_contentDescription);
                        tde.B = obtainStyledAttributes2.getText(p3c.MenuItem_tooltipText);
                        if (obtainStyledAttributes2.hasValue(p3c.MenuItem_iconTintMode)) {
                            tde.D = hq4.c(obtainStyledAttributes2.getInt(p3c.MenuItem_iconTintMode, -1), tde.D);
                        } else {
                            tde.D = null;
                        }
                        if (obtainStyledAttributes2.hasValue(p3c.MenuItem_iconTint)) {
                            int i2 = p3c.MenuItem_iconTint;
                            if (!obtainStyledAttributes2.hasValue(i2) || (resourceId = obtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = z7.n(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(i2);
                            }
                            tde.C = colorStateList;
                        } else {
                            tde.C = null;
                        }
                        obtainStyledAttributes2.recycle();
                        tde.h = false;
                    } else {
                        if (name3.equals("menu")) {
                            tde.h = true;
                            SubMenu addSubMenu = tde.a.addSubMenu(tde.b, tde.i, tde.j, tde.k);
                            tde.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof wq8)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            XmlResourceParser layout = this.c.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof wq8) {
                wq8 wq8 = (wq8) menu;
                if (!wq8.A0) {
                    wq8.w();
                    z = true;
                }
            }
            b(layout, asAttributeSet, menu);
            if (z) {
                ((wq8) menu).v();
            }
            layout.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (0 != 0) {
                ((wq8) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
