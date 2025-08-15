package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* renamed from: e7  reason: default package */
public final class e7 implements or8 {
    public int A0;
    public boolean B0;
    public final SparseBooleanArray C0 = new SparseBooleanArray();
    public b7 D0;
    public b7 E0;
    public i76 F0;
    public c7 G0;
    public final qqd H0 = new qqd(1, (Object) this);
    public nr8 X;
    public final int Y;
    public final int Z;
    public final Context a;
    public Context b;
    public wq8 c;
    public final LayoutInflater o;
    public qr8 s0;
    public d7 t0;
    public Drawable u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;

    public e7(Context context) {
        int i = zyb.abc_action_menu_layout;
        int i2 = zyb.abc_action_menu_item_layout;
        this.a = context;
        this.o = LayoutInflater.from(context);
        this.Y = i;
        this.Z = i2;
    }

    public final View a(br8 br8, View view, ViewGroup viewGroup) {
        pr8 pr8;
        View actionView = br8.getActionView();
        int i = 0;
        if (actionView == null || br8.e()) {
            if (view instanceof pr8) {
                pr8 = (pr8) view;
            } else {
                pr8 = (pr8) this.o.inflate(this.Z, viewGroup, false);
            }
            pr8.d(br8);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) pr8;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.s0);
            if (this.G0 == null) {
                this.G0 = new c7(this);
            }
            actionMenuItemView.setPopupCallback(this.G0);
            actionView = (View) pr8;
        }
        if (br8.N0) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof g7)) {
            actionView.setLayoutParams(ActionMenuView.e(layoutParams));
        }
        return actionView;
    }

    public final boolean b(qae qae) {
        boolean z;
        if (!qae.hasVisibleItems()) {
            return false;
        }
        qae qae2 = qae;
        while (true) {
            wq8 wq8 = qae2.K0;
            if (wq8 == this.c) {
                break;
            }
            qae2 = wq8;
        }
        ViewGroup viewGroup = (ViewGroup) this.s0;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof pr8) && ((pr8) childAt).getItemData() == qae2.L0) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        qae.L0.getClass();
        int size = qae.Y.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = qae.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        b7 b7Var = new b7(this, this.b, qae, view);
        this.E0 = b7Var;
        b7Var.h = z;
        gr8 gr8 = b7Var.j;
        if (gr8 != null) {
            gr8.o(z);
        }
        b7 b7Var2 = this.E0;
        if (!b7Var2.b()) {
            if (b7Var2.f != null) {
                b7Var2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        nr8 nr8 = this.X;
        if (nr8 != null) {
            nr8.o(qae);
        }
        return true;
    }

    public final void c(wq8 wq8, boolean z) {
        f();
        b7 b7Var = this.E0;
        if (b7Var != null && b7Var.b()) {
            b7Var.j.dismiss();
        }
        nr8 nr8 = this.X;
        if (nr8 != null) {
            nr8.c(wq8, z);
        }
    }

    public final boolean d() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        wq8 wq8 = this.c;
        if (wq8 != null) {
            arrayList = wq8.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.A0;
        int i4 = this.z0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.s0;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            br8 br8 = (br8) arrayList.get(i5);
            int i8 = br8.J0;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (this.B0 && br8.N0) {
                i3 = 0;
            }
            i5++;
        }
        if (this.w0 && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.C0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            br8 br82 = (br8) arrayList.get(i10);
            int i12 = br82.J0;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = br82.b;
            if (z3) {
                View a2 = a(br82, (View) null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                br82.g(z);
            } else if ((i12 & true) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View a3 = a(br82, (View) null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        br8 br83 = (br8) arrayList.get(i14);
                        if (br83.b == i13) {
                            if (br83.f()) {
                                i9++;
                            }
                            br83.g(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                br82.g(z5);
            } else {
                br82.g(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    public final boolean e(br8 br8) {
        return false;
    }

    public final boolean f() {
        qr8 qr8;
        i76 i76 = this.F0;
        if (i76 == null || (qr8 = this.s0) == null) {
            b7 b7Var = this.D0;
            if (b7Var == null) {
                return false;
            }
            if (b7Var.b()) {
                b7Var.j.dismiss();
            }
            return true;
        }
        ((View) qr8).removeCallbacks(i76);
        this.F0 = null;
        return true;
    }

    public final void g(nr8 nr8) {
        this.X = nr8;
    }

    public final boolean h(br8 br8) {
        return false;
    }

    public final void i() {
        qr8 qr8;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.s0;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            wq8 wq8 = this.c;
            if (wq8 != null) {
                wq8.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    br8 br8 = (br8) l.get(i2);
                    if (br8.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        br8 itemData = childAt instanceof pr8 ? ((pr8) childAt).getItemData() : null;
                        View a2 = a(br8, childAt, viewGroup);
                        if (br8 != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.s0).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.t0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.s0).requestLayout();
        wq8 wq82 = this.c;
        if (wq82 != null) {
            wq82.i();
            ArrayList arrayList2 = wq82.t0;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k7 k7Var = ((br8) arrayList2.get(i3)).L0;
            }
        }
        wq8 wq83 = this.c;
        if (wq83 != null) {
            wq83.i();
            arrayList = wq83.u0;
        }
        if (this.w0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((br8) arrayList.get(0)).N0;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.t0 == null) {
                this.t0 = new d7(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.t0.getParent();
            if (viewGroup3 != this.s0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.t0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.s0;
                d7 d7Var = this.t0;
                actionMenuView.getClass();
                g7 c2 = ActionMenuView.c();
                c2.a = true;
                actionMenuView.addView(d7Var, c2);
            }
        } else {
            d7 d7Var2 = this.t0;
            if (d7Var2 != null && d7Var2.getParent() == (qr8 = this.s0)) {
                ((ViewGroup) qr8).removeView(this.t0);
            }
        }
        ((ActionMenuView) this.s0).setOverflowReserved(this.w0);
    }

    public final boolean j() {
        b7 b7Var = this.D0;
        return b7Var != null && b7Var.b();
    }

    public final void k(Context context, wq8 wq8) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = wq8;
        Resources resources = context.getResources();
        if (!this.x0) {
            this.w0 = true;
        }
        int i = 2;
        this.y0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.A0 = i;
        int i4 = this.y0;
        if (this.w0) {
            if (this.t0 == null) {
                d7 d7Var = new d7(this, this.a);
                this.t0 = d7Var;
                if (this.v0) {
                    d7Var.setImageDrawable(this.u0);
                    this.u0 = null;
                    this.v0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.t0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.t0.getMeasuredWidth();
        } else {
            this.t0 = null;
        }
        this.z0 = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        wq8 wq8;
        if (!this.w0 || j() || (wq8 = this.c) == null || this.s0 == null || this.F0 != null) {
            return false;
        }
        wq8.i();
        if (wq8.u0.isEmpty()) {
            return false;
        }
        i76 i76 = new i76((Object) this, (Object) new b7(this, this.b, this.c, (View) this.t0), false, 1);
        this.F0 = i76;
        ((View) this.s0).post(i76);
        return true;
    }
}
