package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: vic  reason: default package */
public abstract class vic {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, (tu0) null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, tu0 tu0, boolean z, boolean z2) {
        int i3 = i;
        TypedValue typedValue2 = typedValue;
        int i4 = i2;
        tu0 tu02 = tu0;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue2.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                Typeface typeface2 = (Typeface) a4f.b.c(a4f.d(resources, i, charSequence2, typedValue2.assetCookie, i4));
                if (typeface2 != null) {
                    if (tu02 != null) {
                        new Handler(Looper.getMainLooper()).post(new do9(tu02, 29, typeface2));
                    }
                    typeface = typeface2;
                } else if (!z2) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            rx5 w = c37.w(resources.getXml(i), resources);
                            if (w != null) {
                                typeface = a4f.b(context, w, resources, i, charSequence2, typedValue2.assetCookie, i2, tu0, z);
                            } else if (tu02 != null) {
                                tu02.c(-3);
                            }
                        } else {
                            Typeface c2 = a4f.c(resources, i, charSequence2, typedValue2.assetCookie, i4);
                            if (tu02 != null) {
                                if (c2 != null) {
                                    new Handler(Looper.getMainLooper()).post(new do9(tu02, 29, c2));
                                } else {
                                    tu02.c(-3);
                                }
                            }
                            typeface = c2;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (tu02 != null) {
                            tu02.c(-3);
                        }
                    }
                }
            } else if (tu02 != null) {
                tu02.c(-3);
            }
            if (typeface != null || tu02 != null || z2) {
                return typeface;
            }
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
    }
}
