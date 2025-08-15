package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

public abstract class b extends yb3 implements y7 {
    public final gaa E0 = new gaa((Object) new z06(this));
    public final gh7 F0 = new gh7(this);
    public boolean G0;
    public boolean H0;
    public boolean I0 = true;

    public b() {
        ((mm) this.o.o).f("android:support:lifecycle", new qb3(1, this));
        t(new y06(this, 0));
        this.v0.add(new y06(this, 1));
        z(new rb3(this, 1));
    }

    public static boolean T(c cVar) {
        boolean z = false;
        for (a aVar : cVar.c.f()) {
            if (aVar != null) {
                z06 z06 = aVar.G0;
                if ((z06 == null ? null : z06.x0) != null) {
                    z |= T(aVar.c0());
                }
                x16 x16 = aVar.e1;
                fg7 fg7 = fg7.o;
                fg7 fg72 = fg7.c;
                if (x16 != null) {
                    x16.b();
                    if (x16.X.d.a(fg7)) {
                        gh7 gh7 = aVar.e1.X;
                        gh7.c("setCurrentState");
                        gh7.e(fg72);
                        z = true;
                    }
                }
                if (aVar.d1.d.a(fg7)) {
                    gh7 gh72 = aVar.d1;
                    gh72.c("setCurrentState");
                    gh72.e(fg72);
                    z = true;
                }
            }
        }
        return z;
    }

    public final n16 S() {
        return ((z06) this.E0.a).w0;
    }

    public void U() {
        this.F0.d(eg7.ON_RESUME);
        n16 n16 = ((z06) this.E0.a).w0;
        n16.H = false;
        n16.I = false;
        n16.O.g = false;
        n16.u(7);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r2.equals("--contentcapture") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r2.equals("--list-dumpables") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r2.equals("--dump-dumpable") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (android.os.Build.VERSION.SDK_INT < 31) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2.equals("--autofill") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            r4 = this;
            super.dump(r5, r6, r7, r8)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0052
            int r2 = r8.length
            if (r2 != 0) goto L_0x000b
            goto L_0x0052
        L_0x000b:
            r2 = r8[r1]
            int r3 = r2.hashCode()
            switch(r3) {
                case -645125871: goto L_0x0042;
                case 100470631: goto L_0x0032;
                case 472614934: goto L_0x0029;
                case 1159329357: goto L_0x0020;
                case 1455016274: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0052
        L_0x0015:
            java.lang.String r3 = "--autofill"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001e
            goto L_0x0052
        L_0x001e:
            r1 = r0
            goto L_0x0052
        L_0x0020:
            java.lang.String r3 = "--contentcapture"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001e
            goto L_0x0052
        L_0x0029:
            java.lang.String r3 = "--list-dumpables"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x003b
            goto L_0x0052
        L_0x0032:
            java.lang.String r3 = "--dump-dumpable"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L_0x0052
            goto L_0x001e
        L_0x0042:
            java.lang.String r3 = "--translation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L_0x0052
            goto L_0x001e
        L_0x0052:
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0056
            return
        L_0x0056:
            r7.print(r5)
            java.lang.String r0 = "Local FragmentActivity "
            r7.print(r0)
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " State:"
            r7.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.print(r0)
            java.lang.String r1 = "mCreated="
            r7.print(r1)
            boolean r1 = r4.G0
            r7.print(r1)
            java.lang.String r1 = " mResumed="
            r7.print(r1)
            boolean r1 = r4.H0
            r7.print(r1)
            java.lang.String r1 = " mStopped="
            r7.print(r1)
            boolean r1 = r4.I0
            r7.print(r1)
            android.app.Application r1 = r4.getApplication()
            if (r1 == 0) goto L_0x00b2
            androidx.loader.app.b r1 = new androidx.loader.app.b
            xnf r2 = r4.w()
            r1.<init>(r4, r2)
            r1.a(r0, r7)
        L_0x00b2:
            gaa r4 = r4.E0
            java.lang.Object r4 = r4.a
            z06 r4 = (defpackage.z06) r4
            n16 r4 = r4.w0
            r4.w(r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.E0.D();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F0.d(eg7.ON_CREATE);
        n16 n16 = ((z06) this.E0.a).w0;
        n16.H = false;
        n16.I = false;
        n16.O.g = false;
        n16.u(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((z06) this.E0.a).w0.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        ((z06) this.E0.a).w0.l();
        this.F0.d(eg7.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((z06) this.E0.a).w0.j();
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.H0 = false;
        ((z06) this.E0.a).w0.u(5);
        this.F0.d(eg7.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        U();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.E0.D();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        gaa gaa = this.E0;
        gaa.D();
        super.onResume();
        this.H0 = true;
        ((z06) gaa.a).w0.A(true);
    }

    public void onStart() {
        gaa gaa = this.E0;
        gaa.D();
        super.onStart();
        this.I0 = false;
        boolean z = this.G0;
        z06 z06 = (z06) gaa.a;
        if (!z) {
            this.G0 = true;
            n16 n16 = z06.w0;
            n16.H = false;
            n16.I = false;
            n16.O.g = false;
            n16.u(4);
        }
        z06.w0.A(true);
        this.F0.d(eg7.ON_START);
        n16 n162 = z06.w0;
        n162.H = false;
        n162.I = false;
        n162.O.g = false;
        n162.u(5);
    }

    public final void onStateNotSaved() {
        this.E0.D();
    }

    public void onStop() {
        super.onStop();
        this.I0 = true;
        do {
        } while (T(S()));
        n16 n16 = ((z06) this.E0.a).w0;
        n16.I = true;
        n16.O.g = true;
        n16.u(4);
        this.F0.d(eg7.ON_STOP);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((z06) this.E0.a).w0.f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
