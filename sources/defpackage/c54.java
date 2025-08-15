package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.VectorPath;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: c54  reason: default package */
public abstract class c54 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Object c = new Object();
    public static t4f d;
    public static final Object e = new Object();

    public static void A(yg7 yg7, Bundle bundle) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (bundle != null) {
            xg7 c2 = yg7.c();
            t9e t9e = (t9e) bundle.getParcelable("LifecycleHandler.permissionRequests");
            if (t9e == null || (sparseArray = t9e.a) == null) {
                sparseArray = new SparseArray();
            }
            c2.g = sparseArray;
            xg7 c3 = yg7.c();
            t9e t9e2 = (t9e) bundle.getParcelable("LifecycleHandler.activityRequests");
            if (t9e2 == null || (sparseArray2 = t9e2.a) == null) {
                sparseArray2 = new SparseArray();
            }
            c3.h = sparseArray2;
            xg7 c4 = yg7.c();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            c4.i = parcelableArrayList;
        }
    }

    public static void B(yg7 yg7) {
        Activity activity = yg7.c().b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(yg7);
            zg7.a.remove(activity);
            r(yg7, false);
            yg7.c().b = null;
        }
        yg7.c().j.clear();
    }

    public static boolean C(yg7 yg7, MenuItem menuItem, k56 k56) {
        List w = w(yg7);
        if (!w.isEmpty()) {
            Iterator it = w.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((b8) it.next()).w(menuItem)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return ((Boolean) k56.invoke()).booleanValue();
    }

    public static void D(yg7 yg7, int i, String[] strArr, int[] iArr) {
        String str = (String) yg7.c().g.get(i);
        if (str != null) {
            for (b8 f : w(yg7)) {
                uu3 f2 = f.f(str);
                if (f2 != null) {
                    f2.requestPermissionsResult(i, strArr, iArr);
                }
            }
        }
    }

    public static void E(yg7 yg7, Bundle bundle) {
        bundle.putParcelable("LifecycleHandler.permissionRequests", new t9e(yg7.c().g));
        bundle.putParcelable("LifecycleHandler.activityRequests", new t9e(yg7.c().h));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", yg7.c().i);
    }

    public static void F(yg7 yg7, Activity activity, wg7 wg7) {
        yg7.c().b = activity;
        if (!yg7.c().c) {
            yg7.c().c = true;
            activity.getApplication().registerActivityLifecycleCallbacks(yg7);
            zg7.a.put(activity, wg7);
        }
    }

    public static void G(yg7 yg7, String str, String[] strArr, int i) {
        if (yg7.c().e) {
            yg7.c().g.put(i, str);
            yg7.requestPermissions(strArr, i);
            return;
        }
        yg7.c().i.add(new vsa(str, strArr, i));
    }

    public static void H(yg7 yg7, String str) {
        int size = yg7.c().h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (str.equals(yg7.c().h.get(yg7.c().h.keyAt(size)))) {
                yg7.c().h.removeAt(size);
            }
        }
    }

    public static final boolean I(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        h37 h37 = new h37(0, bArr2.length - 1, 1);
        if (!(h37 instanceof Collection) || !((Collection) h37).isEmpty()) {
            Iterator it = h37.iterator();
            while (((i37) it).c) {
                int a2 = ((i37) it).a();
                if (bArr[i + a2] != bArr2[a2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean J(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static final boolean K(View view) {
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final void L(int i, int i2, int i3, int i4, View view, View view2) {
        if (K(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static int M(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    public static int N(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final List O(pua pua) {
        Object obj;
        List list = pua.f;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Long) obj).longValue() > 0) {
                break;
            }
        }
        if (obj == null) {
            List<String> list2 = pua.e;
            list = new ArrayList(z53.S(list2, 10));
            for (String str : list2) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                Long f0 = dae.f0(sb.toString());
                list.add(Long.valueOf(f0 != null ? f0.longValue() : 0));
            }
        }
        return list;
    }

    public static void P(yg7 yg7, Activity activity) {
        if (zg7.a(activity, yg7.c().a) == yg7) {
            yg7.c().b = activity;
            for (b8 u : x53.D0(yg7.c().j.values())) {
                u.u();
            }
        }
    }

    public static void Q(yg7 yg7, Activity activity) {
        if (yg7.c().b == activity) {
            for (b8 q : w(yg7)) {
                q.q(activity);
            }
        }
    }

    public static void R(yg7 yg7, Activity activity) {
        if (yg7.c().b == activity) {
            for (b8 r : w(yg7)) {
                r.r(activity);
            }
        }
    }

    public static void S(yg7 yg7, Activity activity, Bundle bundle) {
        if (yg7.c().b == activity) {
            X(yg7);
            for (b8 b8Var : w(yg7)) {
                Bundle bundle2 = new Bundle();
                b8Var.O(bundle2);
                StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
                ViewGroup viewGroup = b8Var.i;
                sb.append(viewGroup != null ? viewGroup.getId() : 0);
                bundle.putBundle(sb.toString(), bundle2);
            }
        }
    }

    public static void T(yg7 yg7, Activity activity) {
        if (yg7.c().b == activity) {
            yg7.c().f = false;
            for (b8 s : w(yg7)) {
                s.s(activity);
            }
        }
    }

    public static void U(yg7 yg7, Activity activity) {
        if (yg7.c().b == activity) {
            X(yg7);
            for (b8 t : w(yg7)) {
                t.t(activity);
            }
        }
    }

    public static void V(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static final void W(BottomSheetWidget bottomSheetWidget, String str, a66 a66) {
        vj7 vj7 = (vj7) ehd.a.getAccessor().d(vj7.class).getValue();
        vj7.getClass();
        a66.invoke(new t03(new m58(vj7.e(Uri.parse(str)), 17), 11), new l(22, bottomSheetWidget));
    }

    public static void X(yg7 yg7) {
        if (!yg7.c().f) {
            yg7.c().f = true;
            for (b8 F : w(yg7)) {
                F.F();
            }
        }
    }

    public static View Y(Context context, yka yka, ala ala) {
        if (yka instanceof vka) {
            OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
            oneMeButton.d(Integer.valueOf(((vka) yka).a), true);
            tu0.K(oneMeButton, 300, new elb(10, (Object) yka));
            return oneMeButton;
        } else if (yka instanceof wka) {
            wka wka = (wka) yka;
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageDrawable(kt3.b(context, wka.a));
            int G = tu0.G(((float) wka.b) * fk4.d().getDisplayMetrics().density);
            imageView.setPadding(G, G, G, G);
            float f = (float) 32;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
            imageView.setOutlineProvider(new ix3(wka.c * fk4.d().getDisplayMetrics().density));
            tu0.K(imageView, 300, new elb(11, (Object) wka));
            return imageView;
        } else if (yka instanceof xka) {
            eha eha = new eha(context);
            eha.setPadding(0, 0, 0, 0);
            eha.setListener(new cjg(eha, ala, yka));
            return eha;
        } else if (yka == null) {
            return null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void Z(ubf ubf, String str, int i) {
        VectorPath findPath = ubf.findPath(str);
        if (findPath != null) {
            findPath.setFillColor(i);
            ubf.invalidatePath();
        }
    }

    public static final t4f a(Context context) {
        t4f t4f;
        t4f t4f2 = d;
        if (t4f2 != null) {
            return t4f2;
        }
        synchronized (e) {
            t4f = new t4f();
            d = t4f;
        }
        return t4f;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [njc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a0(kotlin.coroutines.Continuation r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L_0x000b
            kotlinx.coroutines.internal.DispatchedContinuation r3 = (kotlinx.coroutines.internal.DispatchedContinuation) r3
            java.lang.String r3 = r3.toString()
            goto L_0x0053
        L_0x000b:
            r0 = 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            r1.append(r3)     // Catch:{ all -> 0x0024 }
            r1.append(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = u(r3)     // Catch:{ all -> 0x0024 }
            r1.append(r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r1 = move-exception
            njc r2 = new njc
            r2.<init>(r1)
            r1 = r2
        L_0x002b:
            java.lang.Throwable r2 = defpackage.pjc.a(r1)
            if (r2 != 0) goto L_0x0032
            goto L_0x0050
        L_0x0032:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = u(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L_0x0050:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x0053:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.a0(kotlin.coroutines.Continuation):java.lang.String");
    }

    public static void b(Appendable appendable, Object obj, m56 m56) {
        if (m56 != null) {
            appendable.append((CharSequence) m56.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static final void c(View view) {
        char c2 = 1;
        if (view.getContext().getResources().getConfiguration().getLayoutDirection() != 1) {
            c2 = 2;
        }
        int i = 1;
        if (c2 != 1) {
            if (c2 == 2) {
                i = 0;
            } else {
                throw null;
            }
        }
        view.setLayoutDirection(i);
    }

    public static boolean d(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    public static final byte[] e(String str) {
        try {
            return str.getBytes(Charset.forName(HTTP.ASCII));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = g(r9, r10, r11)
            boolean r1 = g(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x000f
            goto L_0x0078
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0077
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0077
        L_0x0043:
            if (r9 == r5) goto L_0x0077
            if (r9 != r4) goto L_0x0048
            goto L_0x0077
        L_0x0048:
            int r11 = M(r9, r10, r11)
            if (r9 == r5) goto L_0x006a
            if (r9 == r3) goto L_0x0065
            if (r9 == r4) goto L_0x0060
            if (r9 != r1) goto L_0x005a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L_0x0058:
            int r9 = r9 - r10
            goto L_0x006f
        L_0x005a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0060:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0058
        L_0x0065:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0058
        L_0x006a:
            int r9 = r10.left
            int r10 = r12.left
            goto L_0x0058
        L_0x006f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x0076
            r2 = r6
        L_0x0076:
            return r2
        L_0x0077:
            return r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.f(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static Uri h(String str, String str2, String str3) {
        Uri.Builder encodedPath = new Uri.Builder().scheme(str2).encodedAuthority(str3).encodedPath(w9e.W0(str, "?").toLowerCase(Locale.ROOT));
        StringBuilder sb = new StringBuilder();
        int A0 = w9e.A0(str, "?", 0, false, 6);
        String substring = A0 == -1 ? "" : str.substring(A0 + 1, str.length());
        int length = substring.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (substring.charAt(i2) == '=') {
                j37 Y = ote.Y(i, i2);
                sb.append(substring.substring(Y.a, Y.b + 1).toLowerCase(Locale.ROOT));
            } else if (substring.charAt(i2) == '&') {
                j37 Y2 = ote.Y(i, i2);
                sb.append(substring.substring(Y2.a, Y2.b + 1));
            } else {
                if (i2 == substring.length() - 1) {
                    j37 Y3 = ote.Y(i, i2 + 1);
                    sb.append(substring.substring(Y3.a, Y3.b + 1));
                }
            }
            i = i2;
        }
        return encodedPath.encodedQuery(sb.toString()).build();
    }

    public static String i(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = oaf.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    public static void j(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(int i, String str, int i2, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        } else if (i > i3) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
        }
    }

    public static void m(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void n(int i, Object[] objArr) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(zr6.h(i2, "at index "));
            }
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void p(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static Bitmap q(byte[] bArr, int i, BitmapFactory.Options options) {
        int i2 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                c65 c65 = new c65((InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                switch (c65.e(1, "Orientation")) {
                    case 3:
                    case 4:
                        i2 = 180;
                        break;
                    case 5:
                    case 8:
                        i2 = 270;
                        break;
                    case 6:
                    case 7:
                        i2 = 90;
                        break;
                }
                if (i2 == 0) {
                    return decodeByteArray;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i2);
                return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        throw th;
    }

    public static void r(yg7 yg7, boolean z) {
        if (!yg7.c().d) {
            yg7.c().d = true;
            Activity activity = yg7.c().b;
            if (activity != null) {
                for (b8 p : w(yg7)) {
                    p.p(activity, z);
                }
            }
        }
    }

    public static void s(eu4 eu4) {
        if (eu4.equals(eu4.f)) {
            throw new RuntimeException("The specified dynamic range=" + eu4 + " is not supported yet", (Throwable) null);
        }
    }

    public static final ConversationEndReason t(bpd bpd) {
        switch (bpd == null ? -1 : sod.$EnumSwitchMapping$0[bpd.ordinal()]) {
            case -1:
                return null;
            case 1:
                return ConversationEndReason.Canceled.INSTANCE;
            case 2:
                return ConversationEndReason.Rejected.INSTANCE;
            case 3:
                return ConversationEndReason.Hangup.INSTANCE;
            case 4:
                return ConversationEndReason.Missed.INSTANCE;
            case 5:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 6:
                return ConversationEndReason.Busy.INSTANCE;
            case 7:
                return new ConversationEndReason.Error(new RuntimeException("Closed by the server error"));
            case 8:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 9:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 10:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 11:
                return ConversationEndReason.CallTimeout.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static b8 v(yg7 yg7, w12 w12, Bundle bundle, wg7 wg7) {
        Map map = yg7.c().j;
        LinkedHashMap linkedHashMap = zg7.a;
        b8 b8Var = (b8) map.get(Integer.valueOf(w12.getId()));
        if (b8Var != null) {
            b8Var.Z(wg7, w12);
            return b8Var;
        }
        b8 b8Var2 = new b8();
        b8Var2.Z(wg7, w12);
        if (bundle != null) {
            StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
            ViewGroup viewGroup = b8Var2.i;
            sb.append(viewGroup != null ? viewGroup.getId() : 0);
            Bundle bundle2 = bundle.getBundle(sb.toString());
            if (bundle2 != null) {
                b8Var2.N(bundle2);
            }
        }
        yg7.c().j.put(Integer.valueOf(w12.getId()), b8Var2);
        return b8Var2;
    }

    public static List w(yg7 yg7) {
        return x53.D0(yg7.c().j.values());
    }

    public static final int x(View view) {
        return K(view) ? view.getRight() : view.getLeft();
    }

    public static void y(yg7 yg7, int i, int i2, Intent intent) {
        String str = (String) yg7.c().h.get(i);
        if (str != null) {
            for (b8 f : w(yg7)) {
                uu3 f2 = f.f(str);
                if (f2 != null) {
                    f2.onActivityResult(i, i2, intent);
                }
            }
        }
    }

    public static void z(yg7 yg7, Context context) {
        if (context instanceof Activity) {
            yg7.c().b = (Activity) context;
        }
        yg7.c().d = false;
        if (!yg7.c().e) {
            yg7.c().e = true;
            int size = yg7.c().i.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    vsa vsa = (vsa) yg7.c().i.remove(size);
                    yg7.j(vsa.a, vsa.b, vsa.c);
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            for (b8 u : w(yg7)) {
                u.u();
            }
        }
    }
}
