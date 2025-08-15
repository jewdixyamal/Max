package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: vt3  reason: default package */
public final class vt3 extends hqd {
    public final /* synthetic */ int F0 = 3;
    public final Object G0;
    public final Object H0;
    public Object I0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vt3(android.content.Context r4, defpackage.gw7 r5, java.util.concurrent.ExecutorService r6, defpackage.t5e r7) {
        /*
            r3 = this;
            r0 = 2
            r3.F0 = r0
            s5e r0 = new s5e
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = -2
            r4.<init>(r1, r2)
            r0.setLayoutParams(r4)
            r3.<init>(r0)
            r3.G0 = r0
            a3g r4 = new a3g
            u5e r1 = new u5e
            r1.<init>(r7)
            r4.<init>(r6, r1)
            r3.H0 = r4
            zja r6 = new zja
            r1 = 25
            r6.<init>(r3, r1, r7)
            r0.setHeaderClickAction(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r5 == 0) goto L_0x003a
            yc7 r6 = new yc7
            r7 = 5
            r6.<init>(r7, r5)
            r3.k(r6)
        L_0x003a:
            r3.setAdapter(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt3.<init>(android.content.Context, gw7, java.util.concurrent.ExecutorService, t5e):void");
    }

    public final void A(ol7 ol7) {
        switch (this.F0) {
            case 0:
                if (ol7 instanceof ut3) {
                    ViewGroup viewGroup = (ViewGroup) this.I0;
                    if (viewGroup.getChildCount() <= 0) {
                        ((xxc) this.G0).getClass();
                        viewGroup.addView(xxc.i(this.a.getContext(), (List) ((ut3) ol7).a, (m56) this.H0));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (ol7 instanceof jn8) {
                    jn8 jn8 = (jn8) ol7;
                    this.I0 = jn8;
                    long j = jn8.a;
                    String str = jn8.o;
                    lk3 lk3 = (lk3) this.G0;
                    CharSequence charSequence = jn8.b;
                    lk3.O(j, charSequence, str);
                    lk3.setName(charSequence);
                    v5c v5c = jn8.s0;
                    ((TextView) this.H0).setText(v5c != null ? v5c.a : null);
                    return;
                }
                return;
            case 2:
                if (ol7 instanceof w3e) {
                    w3e w3e = (w3e) ol7;
                    this.I0 = w3e;
                    List list = w3e.X;
                    int size = list.size();
                    s5e s5e = (s5e) this.G0;
                    String format = String.format(s5e.getContext().getResources().getQuantityString(uga.a, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    CharSequence b = w3e.b.b(s5e.getContext());
                    if (b == null) {
                        b = "";
                    }
                    boolean z = w3e.s0;
                    int i = z ? vga.b : vga.a;
                    b7a b7a = z ? b7a.b : b7a.a;
                    v5e v5e = s5e.a;
                    v5e.a.setText(b);
                    v5e.b.setText(format);
                    OneMeButton oneMeButton = v5e.c;
                    oneMeButton.setText(i);
                    oneMeButton.setMode(b7a);
                    oneMeButton.setVisibility(0);
                    ((a3g) this.H0).E(list);
                    return;
                }
                return;
            default:
                n55 n55 = (n55) ol7;
                ((TextView) this.G0).setText(n55.a);
                StringBuilder sb = new StringBuilder();
                sb.append("completedTasks: ");
                sb.append(n55.c);
                sb.append(", activeTasks: ");
                int i2 = n55.o;
                sb.append(i2);
                sb.append(", idleThreads: ");
                sb.append(n55.b);
                sb.append(", tasksInQueue: ");
                sb.append(i2);
                ((TextView) this.H0).setText(sb);
                ((TextView) this.I0).setText("isShutdown: " + n55.Y + ", isTerminated: " + n55.Z);
                return;
        }
    }

    public void B(ol7 ol7, Object obj) {
        switch (this.F0) {
            case 1:
                if (!(obj instanceof in8)) {
                    A(ol7);
                    return;
                }
                v5c v5c = ((in8) obj).a;
                ((TextView) this.H0).setText(v5c != null ? v5c.a : null);
                return;
            default:
                super.B(ol7, obj);
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vt3(android.content.Context r2, defpackage.xxc r3, defpackage.pt8 r4) {
        /*
            r1 = this;
            r0 = 0
            r1.F0 = r0
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r2)
            r1.<init>(r0)
            r1.G0 = r3
            r1.H0 = r4
            r1.I0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt3.<init>(android.content.Context, xxc, pt8):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vt3(android.content.Context r9, defpackage.om8 r10) {
        /*
            r8 = this;
            r0 = 1
            r8.F0 = r0
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r9)
            pdc r1 = new pdc
            r2 = -1
            r3 = -2
            r1.<init>((int) r2, (int) r3)
            r0.setLayoutParams(r1)
            lk3 r1 = new lk3
            r4 = 0
            r1.<init>(r9, r4)
            int r4 = defpackage.mda.G
            r1.setId(r4)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 16
            r5.<init>(r2, r3, r6)
            r1.setLayoutParams(r5)
            r2 = 24
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = defpackage.tu0.G(r3)
            r5 = 12
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            int r3 = defpackage.rh4.c(r5, r6, r3)
            int r5 = r1.getPaddingTop()
            int r6 = r1.getPaddingBottom()
            r7 = 0
            r1.setPadding(r7, r5, r3, r6)
            r0.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            int r9 = defpackage.mda.H
            r1.setId(r9)
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r5 = 8388629(0x800015, float:1.1754973E-38)
            r3.<init>(r2, r2, r5)
            r1.setLayoutParams(r3)
            r2 = 17
            r1.setGravity(r2)
            r2 = 1
            r3 = 1098907648(0x41800000, float:16.0)
            r1.setTextSize(r2, r3)
            r0.addView(r1)
            r8.<init>(r0)
            android.view.View r1 = r0.findViewById(r4)
            lk3 r1 = (defpackage.lk3) r1
            r8.G0 = r1
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.H0 = r9
            vu5 r9 = new vu5
            r1 = 16
            r9.<init>(r8, r1, r10)
            defpackage.tu0.K(r0, 300, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt3.<init>(android.content.Context, om8):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vt3(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 3
            r7.F0 = r0
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r8)
            r1.setLayoutParams(r0)
            int r0 = defpackage.yvb.threads_state_state_view
            r1.setId(r0)
            r0 = 1
            r1.setOrientation(r0)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r2, r2)
            r3.setLayoutParams(r4)
            r4 = 1099956224(0x41900000, float:18.0)
            r3.setTextSize(r4)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r4)
            r1.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r2, r2)
            r5 = 5
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r6 = defpackage.tu0.G(r6)
            r4.topMargin = r6
            r3.setLayoutParams(r4)
            r4 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r4)
            r6 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r3.setTextColor(r6)
            r1.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r2, r2)
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r5 = r5 * r2
            int r2 = defpackage.tu0.G(r5)
            r8.topMargin = r2
            r3.setLayoutParams(r8)
            r3.setTextSize(r4)
            r3.setTextColor(r6)
            r1.addView(r3)
            r7.<init>(r1)
            r8 = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r2 = 0
            android.view.View r8 = r8.getChildAt(r2)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.G0 = r8
            r8 = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View r8 = r8.getChildAt(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.H0 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r8 = 2
            android.view.View r8 = r1.getChildAt(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.I0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt3.<init>(android.content.Context):void");
    }
}
