package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a14  reason: default package */
public abstract class a14 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final Object e = new Object();
    public static volatile a14 f;
    public static final nd2 g = new nd2(18);
    public static final /* synthetic */ int h = 0;
    public static Handler i;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A(ru.ok.android.api.core.ApiInvocationException r4) {
        /*
            r0 = 102(0x66, float:1.43E-43)
            r1 = 1
            int r2 = r4.a
            if (r2 == r0) goto L_0x0027
            r0 = 103(0x67, float:1.44E-43)
            if (r2 == r0) goto L_0x0027
            r0 = 100
            r3 = 0
            if (r2 != r0) goto L_0x0026
            java.lang.String r0 = "session_key"
            java.lang.String r2 = r4.b
            if (r2 == 0) goto L_0x001d
            boolean r2 = defpackage.w9e.p0(r2, r0, r3)
            if (r2 != r1) goto L_0x001d
            goto L_0x0027
        L_0x001d:
            java.lang.String r4 = r4.c
            boolean r4 = defpackage.tpa.f(r4, r0)
            if (r4 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r3
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.A(ru.ok.android.api.core.ApiInvocationException):boolean");
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean C(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean D(XmlPullParser xmlPullParser, String str) {
        return C(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static float E(int i2) {
        float f2 = ((float) i2) / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static void F(float[] fArr, float f2) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void G(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static String H(long j) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))});
    }

    public static void I(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            aq4.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void J(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = zmf.a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i2 = 1;
        boolean z2 = onLongClickListener != null;
        if (hasOnClickListeners || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    public static void K(Context context, int i2) {
        N(0, context, context.getString(i2));
    }

    public static final void L(Activity activity, uia uia) {
        int i2;
        coc coc = (coc) x53.i0(y8a.a.o().f().C().e());
        u6a u6a = null;
        uu3 uu3 = coc != null ? coc.a : null;
        Widget widget = uu3 instanceof Widget ? (Widget) uu3 : null;
        if (widget != null) {
            hm9.m(activity.getClass().getName(), "detect snackbar", new Object[0]);
            eia eia = uia.X;
            if (eia.a == 2) {
                uu3 uu32 = widget;
                while (uu32.getParentController() != null) {
                    uu32 = uu32.getParentController();
                }
                View view = uu32.getView();
                ViewParent parent = view != null ? view.getParent() : null;
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    u6a = (u6a) view2.findViewById(wca.a);
                }
                if (u6a != null) {
                    i2 = u6a.getHeight();
                    wha wha = new wha(widget);
                    wha.b = uia.a(uia, (oia) null, (CharSequence) null, (CharSequence) null, (tia) null, new eia(0, 0, i2 + eia.c, 3), (iia) null, 47);
                    wha.i();
                    return;
                }
            }
            i2 = 0;
            wha wha2 = new wha(widget);
            wha2.b = uia.a(uia, (oia) null, (CharSequence) null, (CharSequence) null, (tia) null, new eia(0, 0, i2 + eia.c, 3), (iia) null, 47);
            wha2.i();
            return;
        }
        hm9.m0(activity.getClass().getName(), "widget is null for snackbar", new Object[0]);
    }

    public static final void M(Activity activity, Intent intent) {
        Object obj;
        uia uia;
        if (intent == null) {
            intent = activity.getIntent();
        }
        try {
            obj = (uia) fm9.D(intent, "snackbar", uia.class);
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Throwable a2 = pjc.a(obj);
        if (a2 != null) {
            hm9.l0(activity.getClass().getName(), "showSnackbarIfNeeded fail", a2);
        }
        if ((!(obj instanceof njc)) && (uia = (uia) obj) != null) {
            L(activity, uia);
        }
    }

    public static void N(int i2, Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Toast.makeText(context, str, i2).show();
                return;
            }
            if (i == null) {
                i = new Handler(Looper.getMainLooper());
            }
            i.post(new si1((Object) context, (Object) str, i2, 16));
        }
    }

    public static String O(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static final void P(y5f y5f) {
        y5f.e(jvc.class, new k1e(23));
        y5f.e(SystemServicesManager$PushTokenGeneratedListener.class, new k1e(24));
        y5f.e(xie.class, new k1e(25));
        y5f.c(qu7.class, new lxc(20));
        y5f.e(acf.class, new k1e(26));
        y5f.e(lqf.class, new k1e(27));
        y5f.e(zp.class, new k1e(28));
        y5f.e(ri4.class, new k1e(29));
        y5f.e(ti4.class, new ybf(0));
        y5f.e(gta.class, new ybf(1));
    }

    public static float T() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.on5 r4, java.lang.Object r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.lp5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            lp5 r0 = (defpackage.lp5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            lp5 r0 = new lp5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            java.lang.Object r6 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x003f
        L_0x0031:
            defpackage.od2.a0(r7)
            r0.o = r6
            r0.Y = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x003f
            return
        L_0x003f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.a(on5, java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):void");
    }

    public static final ShapeDrawable b(int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i2);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setMaskFilter(new BlurMaskFilter(1000.0f, BlurMaskFilter.Blur.NORMAL));
        return shapeDrawable;
    }

    public static final void c(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("?");
            if (i3 < i2 - 1) {
                sb.append(",");
            }
        }
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                aq4.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                aq4.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                aq4.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void e(RootController rootController, Intent intent) {
        if (!rootController.C().n()) {
            n6a n6a = (n6a) y8a.a.getAccessor().c(n6a.class);
            if (n6a.a()) {
                n6a.b();
                return;
            }
            nmc.T.getClass();
            if (!x53.c0(mmc.b, intent.getAction())) {
                f64 P1 = mx7.c.P1();
                ex7.b.getClass();
                P1.b(m64.a(ex7.e.a), (Bundle) null);
            }
        }
    }

    public static int f(Context context) {
        int i2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int i3 = point.x;
        int sqrt = (int) Math.sqrt(Math.pow((double) point.y, 2.0d) + Math.pow((double) i3, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        try {
            i2 = mr0.E();
        } catch (Exception unused) {
            i2 = 0;
        }
        return i2 > 0 ? Math.min(sqrt, i2) : sqrt;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(android.graphics.drawable.StateListDrawable r3, defpackage.fka r4) {
        /*
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            int r0 = r3.findStateDrawableIndex(r0)
            android.graphics.drawable.Drawable r0 = r3.getStateDrawable(r0)
            boolean r1 = r0 instanceof one.me.sdk.richvector.EnhancedVectorDrawable
            r2 = 0
            if (r1 == 0) goto L_0x0017
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = (one.me.sdk.richvector.EnhancedVectorDrawable) r0
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            r1 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1}
            int r1 = r3.findStateDrawableIndex(r1)
            android.graphics.drawable.Drawable r3 = r3.getStateDrawable(r1)
            boolean r1 = r3 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x0031
            r2 = r3
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
        L_0x0031:
            if (r2 != 0) goto L_0x0034
            return
        L_0x0034:
            bs6 r3 = r4.getIcon()
            int r3 = r3.k
            java.lang.String r1 = "circle_background"
            defpackage.c54.Z(r0, r1, r3)
            r3 = 2
            float r3 = (float) r3
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r3 = r3 * r0
            int r3 = defpackage.tu0.G(r3)
            gae r4 = r4.i()
            lae r4 = r4.b
            int r4 = r4.b
            r2.setStroke(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.g(android.graphics.drawable.StateListDrawable, fka):void");
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ImageView.ScaleType k(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static nb3 l(String str, String str2) {
        va0 va0 = new va0(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(va0.class));
        return new nb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new v02(15, va0), hashSet3);
    }

    public static StateListDrawable m(Context context) {
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, jub.ic_check_filled_24);
        pq9 pq9 = qp4.u0;
        c54.Z(enhancedVectorDrawable, "circle_background", k7d.h(pq9, context).k);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        float f2 = (float) 24;
        gradientDrawable.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), pq9.b(context).i().i().b.b);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, enhancedVectorDrawable);
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        return stateListDrawable;
    }

    public static ha0 p(ha0 ha0, Size size, Range range) {
        ha0 ha02 = ha0;
        int i2 = ha02.c;
        int width = size.getWidth();
        int height = size.getHeight();
        int i3 = ha02.h;
        int i4 = ha02.d;
        int c2 = eef.c(i2, i3, i3, i4, i4, width, ha02.e, height, ha02.f, range);
        int width2 = size.getWidth();
        int height2 = size.getHeight();
        return new ha0(ha02.a, ha02.b, c2, ha02.d, width2, height2, ha02.g, ha02.h, ha02.i, ha02.j);
    }

    public static final RootController s(Activity activity) {
        nmc nmc = (nmc) activity;
        if (nmc.g().n()) {
            RootController rootController = (RootController) nmc.g().g("RootController");
            nmc.g().I();
            return rootController;
        }
        RootController rootController2 = new RootController();
        znc g2 = nmc.g();
        coc e2 = i24.e(rootController2, (zu3) null, (zu3) null);
        e2.d("RootController");
        g2.R(e2);
        return rootController2;
    }

    public static nb3 t(String str, ig5 ig5) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(va0.class));
        for (Class cls : new Class[0]) {
            h(cls, "Null interface");
            hashSet.add(lqb.a(cls));
        }
        nh4 a2 = nh4.a(Context.class);
        if (!hashSet.contains(a2.a)) {
            hashSet2.add(a2);
            return new nb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new d74(str, 20, ig5), hashSet3);
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public static a14 u() {
        a14 a14;
        synchronized (e) {
            try {
                if (f == null) {
                    f = new et7(3);
                }
                a14 = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a14;
    }

    public static String v(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static final void w(Activity activity, Intent intent) {
        Object obj;
        bqb bqb;
        Object obj2;
        Object obj3;
        String obj4;
        Intent intent2 = intent;
        boolean z = false;
        y8a y8a = y8a.a;
        n6a n6a = (n6a) y8a.getAccessor().c(n6a.class);
        if (n6a.a()) {
            n6a.b();
            return;
        }
        Long l = null;
        if (intent.getAction() != null && (intent.getFlags() & 1048576) == 0) {
            String action = intent.getAction();
            nmc.T.getClass();
            if (x53.c0(mmc.b, action)) {
                gy2 gy2 = gy2.c;
                gy2.getClass();
                Bundle extras = intent.getExtras();
                if (!(extras == null || (obj3 = extras.get("android.intent.extra.shortcut.ID")) == null || (obj4 = obj3.toString()) == null)) {
                    l = dae.f0(obj4);
                }
                f64 P1 = gy2.P1();
                Bundle bundle = new Bundle();
                bundle.putParcelable("oneme:share:data", intent2);
                if (l != null) {
                    bundle.putLongArray("selected_ids", new long[]{l.longValue()});
                }
                P1.b(":chats/share", bundle);
                return;
            }
        }
        ((ty0) y8a.getAccessor().c(ty0.class)).getClass();
        hm9.m("CallActionsProcessor", "handleCallRedirectActionIntent action=" + intent.getAction(), new Object[0]);
        znc C = y8a.o().f().C();
        String action2 = intent.getAction();
        Class<Uri> cls = Uri.class;
        if (action2 == null) {
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) fm9.D(intent2, "deep_link", cls);
            }
            if (data != null) {
                List list = (List) ps1.a.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (w9e.p0(data.toString(), (String) it.next(), false)) {
                            z = ps1.a(C);
                            break;
                        }
                    }
                }
            }
        } else {
            wa1 d2 = oz7.d(action2);
            if (!(d2 instanceof sa1) && !(d2 instanceof na1)) {
                String str = "";
                if (d2 instanceof ta1) {
                    je7 je7 = ps1.a;
                    String str2 = C.g(":call-incoming") != null ? ":call-incoming" : null;
                    if (str2 == null) {
                        Iterator it2 = C.e().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            String str3 = ((coc) obj2).b;
                            if (str3 != null && w9e.p0(str3, ":call-incoming", false)) {
                                break;
                            }
                        }
                        coc coc = (coc) obj2;
                        str2 = coc != null ? coc.b : null;
                    }
                    if (str2 != null) {
                        C.D(str2);
                    }
                    if (str2 == null) {
                        String stringExtra = intent2.getStringExtra("incoming_param_name");
                        if (stringExtra != null) {
                            str = stringExtra;
                        }
                        String stringExtra2 = intent2.getStringExtra("incoming_param_avatar");
                        long longExtra = intent2.getLongExtra("incoming_param_chat_id", 0);
                        boolean booleanExtra = intent2.getBooleanExtra("incoming_param_is_video", false);
                        f64 P12 = vw7.c.P1();
                        StringBuilder j = z7b.j(":call-incoming?chat_id=", longExtra, "&call_name=", str);
                        j.append("&call_avatar=");
                        j.append(stringExtra2);
                        j.append("&video_enabled=");
                        j.append(booleanExtra);
                        P12.b(j.toString(), (Bundle) null);
                    }
                } else if (d2 instanceof ra1) {
                    if (!ps1.a(C)) {
                        String stringExtra3 = intent2.getStringExtra("link_param");
                        if (stringExtra3 != null) {
                            str = stringExtra3;
                        }
                        f64 P13 = vw7.c.P1();
                        y7g y7g = new y7g(13);
                        y7g.b = ":call-join-preview";
                        y7g.D(str, "link");
                        P13.c(y7g.r(), (Bundle) null);
                    }
                } else if (d2 instanceof ua1) {
                    String stringExtra4 = intent2.getStringExtra("call_id");
                    if (stringExtra4 != null) {
                        str = stringExtra4;
                    }
                    boolean booleanExtra2 = intent2.getBooleanExtra("is_video", false);
                    String[] stringArrayExtra = intent2.getStringArrayExtra("sdk_reasons");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    vw7 vw7 = vw7.c;
                    List m0 = ys.m0(stringArrayExtra);
                    vw7.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append(":call-rate?call_id=" + str + "&is_video=" + booleanExtra2);
                    if (!m0.isEmpty()) {
                        sb.append("&sdk_reasons=".concat(x53.n0(m0, ",", (String) null, (String) null, (m56) null, 62)));
                    }
                    vw7.P1().b(sb.toString(), (Bundle) null);
                }
            } else if (!ps1.a(C)) {
                vw7.c.P1().b(":call-active", (Bundle) null);
            }
            z = true;
        }
        if (z) {
            hm9.m(activity.getClass().getName(), "call detect", new Object[0]);
            return;
        }
        Uri data2 = intent.getData();
        if (data2 == null) {
            data2 = (Uri) fm9.D(intent2, "deep_link", cls);
        }
        if (data2 != null) {
            y8a y8a2 = y8a.a;
            if (((f64) y8a2.getAccessor().c(f64.class)).c(data2, (Bundle) null)) {
                String stringExtra5 = intent2.getStringExtra("external_callback_param_arg");
                if (stringExtra5 != null) {
                    vw7.c.P1().b(":external_callback", dy7.g(new kpa("params", stringExtra5)));
                }
                String name = activity.getClass().getName();
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, name, "deep link detect " + data2, (Throwable) null);
                }
                String stringExtra6 = intent2.getStringExtra("push_action");
                if (stringExtra6 != null) {
                    Class<qx9> cls2 = qx9.class;
                    if (stringExtra6.equals("push_action_open_chat")) {
                        try {
                            obj = (bqb) fm9.D(intent2, "push_info", bqb.class);
                        } catch (Throwable th) {
                            obj = new njc(th);
                        }
                        Throwable a2 = pjc.a(obj);
                        if (a2 != null) {
                            hm9.l0(activity.getClass().getName(), "fail to fetch push info", a2);
                        }
                        if ((!(obj instanceof njc)) && (bqb = (bqb) obj) != null) {
                            rx9 e2 = ((qx9) y8a.a.getAccessor().c(cls2)).e();
                            e2.getClass();
                            String str4 = rx9.d;
                            hm9.m(str4, "onNotificationOpenedForChat: %s", bqb);
                            String str5 = bqb.b;
                            if (str5 != null) {
                                try {
                                    e2.b().b("Action", br7.f(new kpa("trid", Long.valueOf(bqb.a)), new kpa("eKey", str5), new kpa("p_op", "open_chat")));
                                } catch (Exception e3) {
                                    hm9.p(str4, "onNotificationOpenedForChat: failed", e3);
                                    ((cba) e2.c()).c(new Exception("failed to log notification open for chat", e3), true);
                                }
                            }
                        }
                    } else if (stringExtra6.equals("push_action_open_chats")) {
                        rx9 e4 = ((qx9) y8a2.getAccessor().c(cls2)).e();
                        e4.getClass();
                        String str6 = rx9.d;
                        hm9.m(str6, "onNotificationOpened", new Object[0]);
                        try {
                            e4.b().b("Action", Collections.singletonMap("p_op", "open_chats"));
                        } catch (Exception e5) {
                            hm9.p(str6, "onNotificationOpened: failed", e5);
                            ((cba) e4.c()).c(new Exception("failed to log notification open", e5), true);
                        }
                    }
                }
            }
        }
    }

    public static int z(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return s63.b((double) (f6 * fArr[0]), (double) (f4 * fArr[1]), (double) (f5 * fArr[2]));
    }

    public abstract void Q();

    public abstract void R(String str, String str2);

    public abstract void S(String str, String str2, RuntimeException runtimeException);

    public abstract List i(String str, List list);

    public abstract void n(String str, String str2);

    public abstract void o(String str, String str2, Throwable th);

    public abstract void q(String str, String str2);

    public abstract void r(String str, String str2, Throwable th);

    public abstract void x(String str, String str2);

    public abstract void y(String str, CancellationException cancellationException);
}
