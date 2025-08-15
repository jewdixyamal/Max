package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zz1  reason: default package */
public final class zz1 extends gr8 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int M0 = zyb.abc_cascading_menu_item_layout;
    public View A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public nr8 I0;
    public ViewTreeObserver J0;
    public PopupWindow.OnDismissListener K0;
    public boolean L0;
    public final int X;
    public final boolean Y;
    public final Handler Z;
    public final Context b;
    public final int c;
    public final int o;
    public final ArrayList s0 = new ArrayList();
    public final ArrayList t0 = new ArrayList();
    public final sn u0 = new sn(2, this);
    public final ck v0 = new ck(1, this);
    public final gaa w0 = new gaa((Object) this);
    public int x0;
    public int y0;
    public View z0;

    public zz1(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.x0 = 0;
        this.y0 = 0;
        this.b = context;
        this.z0 = view;
        this.o = i;
        this.X = i2;
        this.Y = z;
        this.G0 = false;
        this.B0 = view.getLayoutDirection() != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(xtb.abc_config_prefDialogWidth));
        this.Z = new Handler();
    }

    public final boolean a() {
        ArrayList arrayList = this.t0;
        return arrayList.size() > 0 && ((yz1) arrayList.get(0)).a.K0.isShowing();
    }

    public final boolean b(qae qae) {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            yz1 yz1 = (yz1) it.next();
            if (qae == yz1.b) {
                yz1.a.c.requestFocus();
                return true;
            }
        }
        if (!qae.hasVisibleItems()) {
            return false;
        }
        l(qae);
        nr8 nr8 = this.I0;
        if (nr8 != null) {
            nr8.o(qae);
        }
        return true;
    }

    public final void c(wq8 wq8, boolean z) {
        ArrayList arrayList = this.t0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (wq8 == ((yz1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((yz1) arrayList.get(i2)).b.c(false);
            }
            yz1 yz1 = (yz1) arrayList.remove(i);
            yz1.b.r(this);
            boolean z2 = this.L0;
            mr8 mr8 = yz1.a;
            if (z2) {
                jr8.b(mr8.K0, (Transition) null);
                mr8.K0.setAnimationStyle(0);
            }
            mr8.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.B0 = ((yz1) arrayList.get(size2 - 1)).c;
            } else {
                this.B0 = this.z0.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                nr8 nr8 = this.I0;
                if (nr8 != null) {
                    nr8.c(wq8, true);
                }
                ViewTreeObserver viewTreeObserver = this.J0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.J0.removeGlobalOnLayoutListener(this.u0);
                    }
                    this.J0 = null;
                }
                this.A0.removeOnAttachStateChangeListener(this.v0);
                this.K0.onDismiss();
            } else if (z) {
                ((yz1) arrayList.get(0)).b.c(false);
            }
        }
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        ArrayList arrayList = this.t0;
        int size = arrayList.size();
        if (size > 0) {
            yz1[] yz1Arr = (yz1[]) arrayList.toArray(new yz1[size]);
            for (int i = size - 1; i >= 0; i--) {
                yz1 yz1 = yz1Arr[i];
                if (yz1.a.K0.isShowing()) {
                    yz1.a.dismiss();
                }
            }
        }
    }

    public final void f() {
        if (!a()) {
            ArrayList arrayList = this.s0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((wq8) it.next());
            }
            arrayList.clear();
            View view = this.z0;
            this.A0 = view;
            if (view != null) {
                boolean z = this.J0 == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.J0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.u0);
                }
                this.A0.addOnAttachStateChangeListener(this.v0);
            }
        }
    }

    public final void g(nr8 nr8) {
        this.I0 = nr8;
    }

    public final void i() {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((yz1) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((tq8) adapter).notifyDataSetChanged();
        }
    }

    public final es4 j() {
        ArrayList arrayList = this.t0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((yz1) wg0.f(arrayList, 1)).a.c;
    }

    public final void l(wq8 wq8) {
        wq8.b(this, this.b);
        if (a()) {
            v(wq8);
        } else {
            this.s0.add(wq8);
        }
    }

    public final void n(View view) {
        if (this.z0 != view) {
            this.z0 = view;
            this.y0 = Gravity.getAbsoluteGravity(this.x0, view.getLayoutDirection());
        }
    }

    public final void o(boolean z) {
        this.G0 = z;
    }

    public final void onDismiss() {
        yz1 yz1;
        ArrayList arrayList = this.t0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                yz1 = null;
                break;
            }
            yz1 = (yz1) arrayList.get(i);
            if (!yz1.a.K0.isShowing()) {
                break;
            }
            i++;
        }
        if (yz1 != null) {
            yz1.b.c(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            this.y0 = Gravity.getAbsoluteGravity(i, this.z0.getLayoutDirection());
        }
    }

    public final void q(int i) {
        this.C0 = true;
        this.E0 = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.K0 = onDismissListener;
    }

    public final void s(boolean z) {
        this.H0 = z;
    }

    public final void t(int i) {
        this.D0 = true;
        this.F0 = i;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [mr8, wl7] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011f, code lost:
        if (((r8.getWidth() + r10[0]) + r5) > r11.right) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0124, code lost:
        r8 = 1;
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if ((r10[0] - r5) < 0) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.wq8 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            tq8 r4 = new tq8
            boolean r5 = r0.Y
            int r6 = M0
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r16.a()
            r6 = 1
            if (r5 != 0) goto L_0x0021
            boolean r5 = r0.G0
            if (r5 == 0) goto L_0x0021
            r4.c = r6
            goto L_0x002d
        L_0x0021:
            boolean r5 = r16.a()
            if (r5 == 0) goto L_0x002d
            boolean r5 = defpackage.gr8.u(r17)
            r4.c = r5
        L_0x002d:
            int r5 = r0.c
            int r5 = defpackage.gr8.m(r4, r2, r5)
            mr8 r7 = new mr8
            int r8 = r0.o
            int r9 = r0.X
            r10 = 0
            r7.<init>(r2, r10, r8, r9)
            gaa r2 = r0.w0
            r7.L0 = r2
            r7.A0 = r0
            ln r2 = r7.K0
            r2.setOnDismissListener(r0)
            android.view.View r2 = r0.z0
            r7.z0 = r2
            int r2 = r0.y0
            r7.w0 = r2
            r7.J0 = r6
            ln r2 = r7.K0
            r2.setFocusable(r6)
            ln r2 = r7.K0
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.p(r4)
            r7.r(r5)
            int r2 = r0.y0
            r7.w0 = r2
            java.util.ArrayList r2 = r0.t0
            int r4 = r2.size()
            r9 = 0
            if (r4 <= 0) goto L_0x00e1
            java.lang.Object r4 = defpackage.wg0.f(r2, r6)
            yz1 r4 = (defpackage.yz1) r4
            wq8 r11 = r4.b
            java.util.ArrayList r12 = r11.Y
            int r12 = r12.size()
            r13 = r9
        L_0x007f:
            if (r13 >= r12) goto L_0x0095
            android.view.MenuItem r14 = r11.getItem(r13)
            boolean r15 = r14.hasSubMenu()
            if (r15 == 0) goto L_0x0092
            android.view.SubMenu r15 = r14.getSubMenu()
            if (r1 != r15) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r13 = r13 + 1
            goto L_0x007f
        L_0x0095:
            r14 = r10
        L_0x0096:
            if (r14 != 0) goto L_0x009a
            r6 = r10
            goto L_0x00e3
        L_0x009a:
            mr8 r11 = r4.a
            es4 r11 = r11.c
            android.widget.ListAdapter r12 = r11.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b3
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            tq8 r12 = (defpackage.tq8) r12
            goto L_0x00b6
        L_0x00b3:
            tq8 r12 = (defpackage.tq8) r12
            r13 = r9
        L_0x00b6:
            int r15 = r12.getCount()
            r8 = r9
        L_0x00bb:
            r6 = -1
            if (r8 >= r15) goto L_0x00c9
            br8 r10 = r12.getItem(r8)
            if (r14 != r10) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            int r8 = r8 + 1
            r10 = 0
            goto L_0x00bb
        L_0x00c9:
            r8 = r6
        L_0x00ca:
            if (r8 != r6) goto L_0x00cd
            goto L_0x00e2
        L_0x00cd:
            int r8 = r8 + r13
            int r6 = r11.getFirstVisiblePosition()
            int r8 = r8 - r6
            if (r8 < 0) goto L_0x00e2
            int r6 = r11.getChildCount()
            if (r8 < r6) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            android.view.View r6 = r11.getChildAt(r8)
            goto L_0x00e3
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            r6 = 0
        L_0x00e3:
            if (r6 == 0) goto L_0x015a
            ln r8 = r7.K0
            defpackage.kr8.a(r8, r9)
            ln r8 = r7.K0
            r10 = 0
            defpackage.jr8.a(r8, r10)
            int r8 = r2.size()
            r10 = 1
            int r8 = r8 - r10
            java.lang.Object r8 = r2.get(r8)
            yz1 r8 = (defpackage.yz1) r8
            mr8 r8 = r8.a
            es4 r8 = r8.c
            r10 = 2
            int[] r10 = new int[r10]
            r8.getLocationOnScreen(r10)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r12 = r0.A0
            r12.getWindowVisibleDisplayFrame(r11)
            int r12 = r0.B0
            r13 = 1
            if (r12 != r13) goto L_0x0127
            r10 = r10[r9]
            int r8 = r8.getWidth()
            int r8 = r8 + r10
            int r8 = r8 + r5
            int r10 = r11.right
            if (r8 <= r10) goto L_0x0124
        L_0x0121:
            r10 = r9
            r8 = 1
            goto L_0x012d
        L_0x0124:
            r8 = 1
            r10 = 1
            goto L_0x012d
        L_0x0127:
            r8 = r10[r9]
            int r8 = r8 - r5
            if (r8 >= 0) goto L_0x0121
            goto L_0x0124
        L_0x012d:
            if (r10 != r8) goto L_0x0131
            r8 = 1
            goto L_0x0132
        L_0x0131:
            r8 = r9
        L_0x0132:
            r0.B0 = r10
            r7.z0 = r6
            int r10 = r0.y0
            r11 = 5
            r10 = r10 & r11
            if (r10 != r11) goto L_0x0146
            if (r8 == 0) goto L_0x013f
            goto L_0x014f
        L_0x013f:
            int r5 = r6.getWidth()
            int r5 = 0 - r5
            goto L_0x014f
        L_0x0146:
            if (r8 == 0) goto L_0x014d
            int r5 = r6.getWidth()
            goto L_0x014f
        L_0x014d:
            int r5 = 0 - r5
        L_0x014f:
            r7.Y = r5
            r5 = 1
            r7.v0 = r5
            r7.u0 = r5
            r7.l(r9)
            goto L_0x0178
        L_0x015a:
            boolean r5 = r0.C0
            if (r5 == 0) goto L_0x0162
            int r5 = r0.E0
            r7.Y = r5
        L_0x0162:
            boolean r5 = r0.D0
            if (r5 == 0) goto L_0x016b
            int r5 = r0.F0
            r7.l(r5)
        L_0x016b:
            android.graphics.Rect r5 = r0.a
            if (r5 == 0) goto L_0x0175
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r5)
            goto L_0x0176
        L_0x0175:
            r10 = 0
        L_0x0176:
            r7.I0 = r10
        L_0x0178:
            yz1 r5 = new yz1
            int r6 = r0.B0
            r5.<init>(r7, r1, r6)
            r2.add(r5)
            r7.f()
            es4 r2 = r7.c
            r2.setOnKeyListener(r0)
            if (r4 != 0) goto L_0x01b4
            boolean r0 = r0.H0
            if (r0 == 0) goto L_0x01b4
            java.lang.CharSequence r0 = r1.x0
            if (r0 == 0) goto L_0x01b4
            int r0 = defpackage.zyb.abc_popup_menu_header_item_layout
            android.view.View r0 = r3.inflate(r0, r2, r9)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.setEnabled(r9)
            java.lang.CharSequence r1 = r1.x0
            r3.setText(r1)
            r1 = 0
            r2.addHeaderView(r0, r1, r9)
            r7.f()
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz1.v(wq8):void");
    }
}
