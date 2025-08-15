package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: w1f  reason: default package */
public abstract class w1f implements Cloneable {
    public static final Animator[] N0 = new Animator[0];
    public static final int[] O0 = {2, 1, 3, 4};
    public static final vu4 P0 = new Object();
    public static final ThreadLocal Q0 = new ThreadLocal();
    public final ArrayList A0 = new ArrayList();
    public Animator[] B0 = N0;
    public int C0 = 0;
    public boolean D0 = false;
    public boolean E0 = false;
    public w1f F0 = null;
    public ArrayList G0 = null;
    public ArrayList H0 = new ArrayList();
    public eod I0;
    public fm9 J0;
    public vu4 K0 = P0;
    public long L0;
    public long M0;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public ArrayList Z = null;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator o = null;
    public ArrayList s0 = null;
    public a8g t0 = new a8g(15);
    public a8g u0 = new a8g(15);
    public e2f v0 = null;
    public final int[] w0 = O0;
    public ArrayList x0;
    public ArrayList y0;
    public v1f[] z0;

    public static void c(a8g a8g, View view, g2f g2f) {
        ((us) a8g.a).put(view, g2f);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) a8g.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = zmf.a;
        String k = omf.k(view);
        if (k != null) {
            us usVar = (us) a8g.o;
            if (usVar.containsKey(k)) {
                usVar.put(k, (Object) null);
            } else {
                usVar.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                wv7 wv7 = (wv7) a8g.c;
                if (wv7.d(itemIdAtPosition) >= 0) {
                    View view2 = (View) wv7.c(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        wv7.f(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                wv7.f(itemIdAtPosition, view);
            }
        }
    }

    public static ArrayList o(ArrayList arrayList, int i) {
        if (i > 0) {
            Integer valueOf = Integer.valueOf(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(valueOf)) {
                arrayList.add(valueOf);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qpd, java.lang.Object, us] */
    public static us t() {
        ThreadLocal threadLocal = Q0;
        us usVar = (us) threadLocal.get();
        if (usVar != null) {
            return usVar;
        }
        ? qpd = new qpd();
        threadLocal.set(qpd);
        return qpd;
    }

    public static boolean z(g2f g2f, g2f g2f2, String str) {
        Object obj = g2f.a.get(str);
        Object obj2 = g2f2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(w1f w1f, hme hme, boolean z) {
        w1f w1f2 = this.F0;
        if (w1f2 != null) {
            w1f2.A(w1f, hme, z);
        }
        ArrayList arrayList = this.G0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.G0.size();
            v1f[] v1fArr = this.z0;
            if (v1fArr == null) {
                v1fArr = new v1f[size];
            }
            this.z0 = null;
            v1f[] v1fArr2 = (v1f[]) this.G0.toArray(v1fArr);
            for (int i = 0; i < size; i++) {
                hme.a(v1fArr2[i], w1f, z);
                v1fArr2[i] = null;
            }
            this.z0 = v1fArr2;
        }
    }

    public void B(View view) {
        if (!this.E0) {
            ArrayList arrayList = this.A0;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
            this.B0 = N0;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.B0 = animatorArr;
            A(this, hme.X, false);
            this.D0 = true;
        }
    }

    public void C() {
        us t = t();
        this.L0 = 0;
        for (int i = 0; i < this.H0.size(); i++) {
            Animator animator = (Animator) this.H0.get(i);
            s1f s1f = (s1f) t.get(animator);
            if (!(animator == null || s1f == null)) {
                long j = this.c;
                int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                Animator animator2 = s1f.f;
                if (i2 >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.o;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.A0.add(animator);
                this.L0 = Math.max(this.L0, t1f.a(animator));
            }
        }
        this.H0.clear();
    }

    public w1f D(v1f v1f) {
        w1f w1f;
        ArrayList arrayList = this.G0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(v1f) && (w1f = this.F0) != null) {
            w1f.D(v1f);
        }
        if (this.G0.size() == 0) {
            this.G0 = null;
        }
        return this;
    }

    public void E(View view) {
        this.Y.remove(view);
    }

    public void F(View view) {
        if (this.D0) {
            if (!this.E0) {
                ArrayList arrayList = this.A0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
                this.B0 = N0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.B0 = animatorArr;
                A(this, hme.Y, false);
            }
            this.D0 = false;
        }
    }

    public void G() {
        O();
        us t = t();
        Iterator it = this.H0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (t.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new eh(this, t, false, 5));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.o;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new h6(10, (Object) this));
                    animator.start();
                }
            }
        }
        this.H0.clear();
        n();
    }

    public void H(long j, long j2) {
        long j3 = j;
        long j4 = this.L0;
        boolean z = j3 < j2;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if ((i < 0 && j3 >= 0) || (j2 > j4 && j3 <= j4)) {
            this.E0 = false;
            A(this, hme.b, z);
        }
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
        this.B0 = N0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            t1f.b(animator, Math.min(Math.max(0, j3), t1f.a(animator)));
        }
        this.B0 = animatorArr;
        int i3 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        if ((i3 > 0 && j2 <= j4) || (j3 < 0 && i >= 0)) {
            if (i3 > 0) {
                this.E0 = true;
            }
            A(this, hme.c, z);
        }
    }

    public void I(long j) {
        this.c = j;
    }

    public void J(fm9 fm9) {
        this.J0 = fm9;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.o = timeInterpolator;
    }

    public void L(vu4 vu4) {
        if (vu4 == null) {
            this.K0 = P0;
        } else {
            this.K0 = vu4;
        }
    }

    public void M(eod eod) {
        this.I0 = eod;
    }

    public void N(long j) {
        this.b = j;
    }

    public final void O() {
        if (this.C0 == 0) {
            A(this, hme.b, false);
            this.E0 = false;
        }
        this.C0++;
    }

    public String P(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.o != null) {
            sb.append("interp(");
            sb.append(this.o);
            sb.append(") ");
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(v1f v1f) {
        if (this.G0 == null) {
            this.G0 = new ArrayList();
        }
        this.G0.add(v1f);
    }

    public void b(View view) {
        this.Y.add(view);
    }

    public void d() {
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
        this.B0 = N0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.B0 = animatorArr;
        A(this, hme.o, false);
    }

    public abstract void e(g2f g2f);

    public final void f(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.Z;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                if (view.getParent() instanceof ViewGroup) {
                    g2f g2f = new g2f(view);
                    if (z) {
                        h(g2f);
                    } else {
                        e(g2f);
                    }
                    g2f.c.add(this);
                    g(g2f);
                    if (z) {
                        c(this.t0, view, g2f);
                    } else {
                        c(this.u0, view, g2f);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList2 = this.s0;
                    if (arrayList2 == null || !arrayList2.contains(Integer.valueOf(id))) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
                            f(viewGroup.getChildAt(i), z);
                        }
                    }
                }
            }
        }
    }

    public void g(g2f g2f) {
        if (this.I0 != null) {
            HashMap hashMap = g2f.a;
            if (!hashMap.isEmpty()) {
                this.I0.getClass();
                String[] strArr = eod.c;
                for (int i = 0; i < 2; i++) {
                    if (!hashMap.containsKey(strArr[i])) {
                        this.I0.getClass();
                        Integer num = (Integer) hashMap.get("android:visibility:visibility");
                        View view = g2f.b;
                        if (num == null) {
                            num = Integer.valueOf(view.getVisibility());
                        }
                        hashMap.put("android:visibilityPropagation:visibility", num);
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int round = Math.round(view.getTranslationX()) + iArr[0];
                        iArr[0] = round;
                        iArr[0] = (view.getWidth() / 2) + round;
                        int round2 = Math.round(view.getTranslationY()) + iArr[1];
                        iArr[1] = round2;
                        iArr[1] = (view.getHeight() / 2) + round2;
                        hashMap.put("android:visibilityPropagation:center", iArr);
                        return;
                    }
                }
            }
        }
    }

    public abstract void h(g2f g2f);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    g2f g2f = new g2f(findViewById);
                    if (z) {
                        h(g2f);
                    } else {
                        e(g2f);
                    }
                    g2f.c.add(this);
                    g(g2f);
                    if (z) {
                        c(this.t0, findViewById, g2f);
                    } else {
                        c(this.u0, findViewById, g2f);
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                View view = (View) arrayList2.get(i2);
                g2f g2f2 = new g2f(view);
                if (z) {
                    h(g2f2);
                } else {
                    e(g2f2);
                }
                g2f2.c.add(this);
                g(g2f2);
                if (z) {
                    c(this.t0, view, g2f2);
                } else {
                    c(this.u0, view, g2f2);
                }
            }
            return;
        }
        f(viewGroup, z);
    }

    public final void j(boolean z) {
        if (z) {
            ((us) this.t0.a).clear();
            ((SparseArray) this.t0.b).clear();
            ((wv7) this.t0.c).a();
            return;
        }
        ((us) this.u0.a).clear();
        ((SparseArray) this.u0.b).clear();
        ((wv7) this.u0.c).a();
    }

    /* renamed from: k */
    public w1f clone() {
        try {
            w1f w1f = (w1f) super.clone();
            w1f.H0 = new ArrayList();
            w1f.t0 = new a8g(15);
            w1f.u0 = new a8g(15);
            w1f.x0 = null;
            w1f.y0 = null;
            w1f.getClass();
            w1f.F0 = this;
            w1f.G0 = null;
            return w1f;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator l(ViewGroup viewGroup, g2f g2f, g2f g2f2) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [s1f, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a5, code lost:
        if (r27.getLayoutDirection() == 1) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a9, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b6, code lost:
        if (r27.getLayoutDirection() == 1) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.view.ViewGroup r27, defpackage.a8g r28, defpackage.a8g r29, java.util.ArrayList r30, java.util.ArrayList r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            us r2 = t()
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            int r4 = r30.size()
            w1f r5 = r26.s()
            r5.getClass()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x001e:
            if (r9 >= r4) goto L_0x025d
            r10 = r30
            java.lang.Object r11 = r10.get(r9)
            g2f r11 = (defpackage.g2f) r11
            r12 = r31
            java.lang.Object r13 = r12.get(r9)
            g2f r13 = (defpackage.g2f) r13
            if (r11 == 0) goto L_0x003b
            java.util.ArrayList r15 = r11.c
            boolean r15 = r15.contains(r0)
            if (r15 != 0) goto L_0x003b
            r11 = 0
        L_0x003b:
            if (r13 == 0) goto L_0x0046
            java.util.ArrayList r15 = r13.c
            boolean r15 = r15.contains(r0)
            if (r15 != 0) goto L_0x0046
            r13 = 0
        L_0x0046:
            if (r11 != 0) goto L_0x0052
            if (r13 != 0) goto L_0x0052
        L_0x004a:
            r18 = r4
            r20 = r9
        L_0x004e:
            r17 = 0
            goto L_0x0255
        L_0x0052:
            if (r11 == 0) goto L_0x005c
            if (r13 == 0) goto L_0x005c
            boolean r15 = r0.x(r11, r13)
            if (r15 == 0) goto L_0x004a
        L_0x005c:
            android.animation.Animator r15 = r0.l(r1, r11, r13)
            if (r15 == 0) goto L_0x004a
            java.lang.String r14 = r0.a
            if (r13 == 0) goto L_0x00e3
            java.lang.String[] r6 = r26.u()
            android.view.View r5 = r13.b
            r18 = r4
            if (r6 == 0) goto L_0x00dc
            int r4 = r6.length
            if (r4 <= 0) goto L_0x00dc
            g2f r4 = new g2f
            r4.<init>(r5)
            r10 = r29
            java.lang.Object r12 = r10.a
            us r12 = (defpackage.us) r12
            java.lang.Object r12 = r12.get(r5)
            g2f r12 = (defpackage.g2f) r12
            if (r12 == 0) goto L_0x00a7
            r19 = r15
            r10 = 0
        L_0x0089:
            int r15 = r6.length
            if (r10 >= r15) goto L_0x00a4
            java.util.HashMap r15 = r4.a
            r20 = r9
            r9 = r6[r10]
            r21 = r6
            java.util.HashMap r6 = r12.a
            java.lang.Object r6 = r6.get(r9)
            r15.put(r9, r6)
            int r10 = r10 + 1
            r9 = r20
            r6 = r21
            goto L_0x0089
        L_0x00a4:
            r20 = r9
            goto L_0x00ab
        L_0x00a7:
            r20 = r9
            r19 = r15
        L_0x00ab:
            int r6 = r2.c
            r9 = 0
        L_0x00ae:
            if (r9 >= r6) goto L_0x00d9
            java.lang.Object r10 = r2.f(r9)
            android.animation.Animator r10 = (android.animation.Animator) r10
            java.lang.Object r10 = r2.get(r10)
            s1f r10 = (defpackage.s1f) r10
            g2f r12 = r10.c
            if (r12 == 0) goto L_0x00d6
            android.view.View r12 = r10.a
            if (r12 != r5) goto L_0x00d6
            java.lang.String r12 = r10.b
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x00d6
            g2f r10 = r10.c
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x00d6
            r15 = 0
            goto L_0x00ec
        L_0x00d6:
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00d9:
            r15 = r19
            goto L_0x00ec
        L_0x00dc:
            r20 = r9
            r19 = r15
            r15 = r19
            goto L_0x00eb
        L_0x00e3:
            r18 = r4
            r20 = r9
            r19 = r15
            android.view.View r5 = r11.b
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            if (r15 == 0) goto L_0x004e
            eod r6 = r0.I0
            if (r6 == 0) goto L_0x0232
            if (r11 != 0) goto L_0x00fe
            if (r13 != 0) goto L_0x00fe
            r28 = r2
            r9 = 0
            r17 = 0
            goto L_0x0223
        L_0x00fe:
            fm9 r12 = r0.J0
            if (r12 != 0) goto L_0x0104
            r12 = 0
            goto L_0x0108
        L_0x0104:
            android.graphics.Rect r12 = r12.H()
        L_0x0108:
            r19 = -1
            if (r13 == 0) goto L_0x0128
            r21 = 8
            if (r11 != 0) goto L_0x0111
            goto L_0x0122
        L_0x0111:
            java.util.HashMap r9 = r11.a
            java.lang.String r10 = "android:visibilityPropagation:visibility"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            int r21 = r9.intValue()
        L_0x0122:
            if (r21 != 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            r11 = r13
            r9 = 1
            goto L_0x012a
        L_0x0128:
            r9 = r19
        L_0x012a:
            java.lang.String r10 = "android:visibilityPropagation:center"
            if (r11 != 0) goto L_0x0131
        L_0x012e:
            r13 = r19
            goto L_0x0140
        L_0x0131:
            java.util.HashMap r13 = r11.a
            java.lang.Object r13 = r13.get(r10)
            int[] r13 = (int[]) r13
            if (r13 != 0) goto L_0x013c
            goto L_0x012e
        L_0x013c:
            r17 = 0
            r13 = r13[r17]
        L_0x0140:
            if (r11 != 0) goto L_0x0144
        L_0x0142:
            r11 = 1
            goto L_0x0152
        L_0x0144:
            java.util.HashMap r11 = r11.a
            java.lang.Object r10 = r11.get(r10)
            int[] r10 = (int[]) r10
            if (r10 != 0) goto L_0x014f
            goto L_0x0142
        L_0x014f:
            r11 = 1
            r19 = r10[r11]
        L_0x0152:
            r10 = 2
            int[] r11 = new int[r10]
            r1.getLocationOnScreen(r11)
            r17 = 0
            r21 = r11[r17]
            float r22 = r27.getTranslationX()
            int r22 = java.lang.Math.round(r22)
            int r22 = r22 + r21
            r16 = 1
            r11 = r11[r16]
            float r21 = r27.getTranslationY()
            int r21 = java.lang.Math.round(r21)
            int r21 = r21 + r11
            int r11 = r27.getWidth()
            int r11 = r11 + r22
            int r23 = r27.getHeight()
            int r23 = r23 + r21
            if (r12 == 0) goto L_0x018b
            int r10 = r12.centerX()
            int r12 = r12.centerY()
            goto L_0x0197
        L_0x018b:
            int r12 = r22 + r11
            int r12 = r12 / r10
            int r24 = r21 + r23
            int r10 = r24 / 2
            r25 = r12
            r12 = r10
            r10 = r25
        L_0x0197:
            int r1 = r6.b
            r28 = r2
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != r2) goto L_0x01ac
            int r1 = r27.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01a9
        L_0x01a7:
            r1 = 5
            goto L_0x01aa
        L_0x01a9:
            r1 = 3
        L_0x01aa:
            r2 = 3
            goto L_0x01b9
        L_0x01ac:
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r1 != r2) goto L_0x01aa
            int r1 = r27.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01a7
            goto L_0x01a9
        L_0x01b9:
            if (r1 == r2) goto L_0x01e7
            r2 = 5
            if (r1 == r2) goto L_0x01dd
            r2 = 48
            if (r1 == r2) goto L_0x01d3
            r2 = 80
            if (r1 == r2) goto L_0x01c9
            r1 = r17
            goto L_0x01ef
        L_0x01c9:
            int r19 = r19 - r21
            int r10 = r10 - r13
            int r1 = java.lang.Math.abs(r10)
            int r1 = r1 + r19
            goto L_0x01ef
        L_0x01d3:
            int r23 = r23 - r19
            int r10 = r10 - r13
            int r1 = java.lang.Math.abs(r10)
            int r1 = r1 + r23
            goto L_0x01ef
        L_0x01dd:
            int r13 = r13 - r22
            int r12 = r12 - r19
            int r1 = java.lang.Math.abs(r12)
            int r1 = r1 + r13
            goto L_0x01ef
        L_0x01e7:
            int r11 = r11 - r13
            int r12 = r12 - r19
            int r1 = java.lang.Math.abs(r12)
            int r1 = r1 + r11
        L_0x01ef:
            float r1 = (float) r1
            int r2 = r6.b
            r10 = 3
            if (r2 == r10) goto L_0x0207
            r10 = 5
            if (r2 == r10) goto L_0x0207
            r10 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r10) goto L_0x0207
            r10 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r10) goto L_0x0207
            int r2 = r27.getHeight()
            goto L_0x020b
        L_0x0207:
            int r2 = r27.getWidth()
        L_0x020b:
            float r2 = (float) r2
            float r1 = r1 / r2
            long r10 = r0.c
            r12 = 0
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0217
            r10 = 300(0x12c, double:1.48E-321)
        L_0x0217:
            long r12 = (long) r9
            long r10 = r10 * r12
            float r2 = (float) r10
            float r6 = r6.a
            float r2 = r2 / r6
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            long r9 = (long) r1
        L_0x0223:
            java.util.ArrayList r1 = r0.H0
            int r1 = r1.size()
            int r2 = (int) r9
            r3.put(r1, r2)
            long r7 = java.lang.Math.min(r9, r7)
            goto L_0x0236
        L_0x0232:
            r28 = r2
            r17 = 0
        L_0x0236:
            s1f r1 = new s1f
            android.view.WindowId r2 = r27.getWindowId()
            r1.<init>()
            r1.a = r5
            r1.b = r14
            r1.c = r4
            r1.d = r2
            r1.e = r0
            r1.f = r15
            r2 = r28
            r2.put(r15, r1)
            java.util.ArrayList r1 = r0.H0
            r1.add(r15)
        L_0x0255:
            int r9 = r20 + 1
            r1 = r27
            r4 = r18
            goto L_0x001e
        L_0x025d:
            r17 = 0
            int r1 = r3.size()
            if (r1 == 0) goto L_0x0294
            r5 = r17
        L_0x0267:
            int r1 = r3.size()
            if (r5 >= r1) goto L_0x0294
            int r1 = r3.keyAt(r5)
            java.util.ArrayList r4 = r0.H0
            java.lang.Object r1 = r4.get(r1)
            android.animation.Animator r1 = (android.animation.Animator) r1
            java.lang.Object r1 = r2.get(r1)
            s1f r1 = (defpackage.s1f) r1
            int r4 = r3.valueAt(r5)
            long r9 = (long) r4
            long r9 = r9 - r7
            android.animation.Animator r4 = r1.f
            long r11 = r4.getStartDelay()
            long r11 = r11 + r9
            android.animation.Animator r1 = r1.f
            r1.setStartDelay(r11)
            int r5 = r5 + 1
            goto L_0x0267
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1f.m(android.view.ViewGroup, a8g, a8g, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n() {
        int i = this.C0 - 1;
        this.C0 = i;
        if (i == 0) {
            A(this, hme.c, false);
            for (int i2 = 0; i2 < ((wv7) this.t0.c).h(); i2++) {
                View view = (View) ((wv7) this.t0.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((wv7) this.u0.c).h(); i3++) {
                View view2 = (View) ((wv7) this.u0.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.E0 = true;
        }
    }

    public void p(int i) {
        this.Z = o(this.Z, i);
    }

    public void q(ViewGroup viewGroup) {
        us t = t();
        int i = t.c;
        if (viewGroup != null && i != 0) {
            WindowId windowId = viewGroup.getWindowId();
            us usVar = new us(t);
            t.clear();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                s1f s1f = (s1f) usVar.i(i2);
                if (s1f.a != null && windowId.equals(s1f.d)) {
                    ((Animator) usVar.f(i2)).end();
                }
            }
        }
    }

    public final g2f r(View view, boolean z) {
        e2f e2f = this.v0;
        if (e2f != null) {
            return e2f.r(view, z);
        }
        ArrayList arrayList = z ? this.x0 : this.y0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            g2f g2f = (g2f) arrayList.get(i);
            if (g2f == null) {
                return null;
            }
            if (g2f.b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        return (g2f) (z ? this.y0 : this.x0).get(i);
    }

    public final w1f s() {
        e2f e2f = this.v0;
        return e2f != null ? e2f.s() : this;
    }

    public final String toString() {
        return P("");
    }

    public String[] u() {
        return null;
    }

    public final g2f v(View view, boolean z) {
        e2f e2f = this.v0;
        if (e2f != null) {
            return e2f.v(view, z);
        }
        return (g2f) ((us) (z ? this.t0 : this.u0).a).get(view);
    }

    public boolean w() {
        return !this.A0.isEmpty();
    }

    public boolean x(g2f g2f, g2f g2f2) {
        if (g2f == null || g2f2 == null) {
            return false;
        }
        String[] u = u();
        if (u != null) {
            int length = u.length;
            int i = 0;
            while (i < length) {
                if (!z(g2f, g2f2, u[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String z : g2f.a.keySet()) {
            if (z(g2f, g2f2, z)) {
            }
        }
        return false;
        return true;
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.Z;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList2 = this.X;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.Y;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }
}
