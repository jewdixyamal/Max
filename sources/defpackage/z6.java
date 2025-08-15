package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: z6  reason: default package */
public final class z6 extends k06 {
    public final /* synthetic */ int u0 = 0;
    public final /* synthetic */ View v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z6(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v0 = actionMenuItemView;
    }

    public final und b() {
        b7 b7Var;
        switch (this.u0) {
            case 0:
                a7 a7Var = ((ActionMenuItemView) this.v0).z0;
                if (a7Var == null || (b7Var = ((c7) a7Var).a.E0) == null) {
                    return null;
                }
                return b7Var.a();
            default:
                b7 b7Var2 = ((d7) this.v0).o.D0;
                if (b7Var2 == null) {
                    return null;
                }
                return b7Var2.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r3 = b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r3 = this;
            int r0 = r3.u0
            switch(r0) {
                case 0: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.view.View r3 = r3.v0
            d7 r3 = (defpackage.d7) r3
            e7 r3 = r3.o
            r3.l()
            r3 = 1
            return r3
        L_0x0010:
            android.view.View r0 = r3.v0
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
            vq8 r1 = r0.x0
            r2 = 0
            if (r1 == 0) goto L_0x002e
            br8 r0 = r0.u0
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L_0x002e
            und r3 = r3.b()
            if (r3 == 0) goto L_0x002e
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x002e
            r2 = 1
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6.c():boolean");
    }

    public boolean d() {
        switch (this.u0) {
            case 1:
                e7 e7Var = ((d7) this.v0).o;
                if (e7Var.F0 != null) {
                    return false;
                }
                e7Var.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z6(d7 d7Var, View view) {
        super(view);
        this.v0 = d7Var;
    }
}
