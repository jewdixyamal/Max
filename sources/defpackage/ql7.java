package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: ql7  reason: default package */
public final class ql7 implements or8, AdapterView.OnItemClickListener {
    public final int X;
    public nr8 Y;
    public pl7 Z;
    public Context a;
    public LayoutInflater b;
    public wq8 c;
    public ExpandedMenuView o;

    public ql7(Context context, int i) {
        this.X = i;
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, nr8, java.lang.Object, android.content.DialogInterface$OnDismissListener, xq8] */
    public final boolean b(qae qae) {
        if (!qae.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.a = qae;
        Context context = qae.a;
        sc scVar = new sc(context);
        ql7 ql7 = new ql7(scVar.getContext(), zyb.abc_list_menu_item_layout);
        obj.c = ql7;
        ql7.Y = obj;
        qae.b(ql7, context);
        ql7 ql72 = obj.c;
        if (ql72.Z == null) {
            ql72.Z = new pl7(ql72);
        }
        pl7 pl7 = ql72.Z;
        oc ocVar = scVar.a;
        ocVar.q = pl7;
        ocVar.r = obj;
        View view = qae.z0;
        if (view != null) {
            ocVar.e = view;
        } else {
            ocVar.c = qae.y0;
            scVar.setTitle(qae.x0);
        }
        ocVar.o = obj;
        tc create = scVar.create();
        obj.b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        nr8 nr8 = this.Y;
        if (nr8 == null) {
            return true;
        }
        nr8.o(qae);
        return true;
    }

    public final void c(wq8 wq8, boolean z) {
        nr8 nr8 = this.Y;
        if (nr8 != null) {
            nr8.c(wq8, z);
        }
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(br8 br8) {
        return false;
    }

    public final void g(nr8 nr8) {
        this.Y = nr8;
    }

    public final boolean h(br8 br8) {
        return false;
    }

    public final void i() {
        pl7 pl7 = this.Z;
        if (pl7 != null) {
            pl7.notifyDataSetChanged();
        }
    }

    public final void k(Context context, wq8 wq8) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = wq8;
        pl7 pl7 = this.Z;
        if (pl7 != null) {
            pl7.notifyDataSetChanged();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.Z.getItem(i), this, 0);
    }
}
