package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: un  reason: default package */
public final class un implements ao, DialogInterface.OnClickListener {
    public tc a;
    public ListAdapter b;
    public CharSequence c;
    public final /* synthetic */ bo o;

    public un(bo boVar) {
        this.o = boVar;
    }

    public final boolean a() {
        tc tcVar = this.a;
        if (tcVar != null) {
            return tcVar.isShowing();
        }
        return false;
    }

    public final Drawable b() {
        return null;
    }

    public final int c() {
        return 0;
    }

    public final void d(int i) {
    }

    public final void dismiss() {
        tc tcVar = this.a;
        if (tcVar != null) {
            tcVar.dismiss();
            this.a = null;
        }
    }

    public final CharSequence e() {
        return this.c;
    }

    public final void g(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void i(Drawable drawable) {
    }

    public final void l(int i) {
    }

    public final void m(int i) {
    }

    public final void n(int i, int i2) {
        if (this.b != null) {
            bo boVar = this.o;
            sc scVar = new sc(boVar.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                scVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.b;
            int selectedItemPosition = boVar.getSelectedItemPosition();
            oc ocVar = scVar.a;
            ocVar.q = listAdapter;
            ocVar.r = this;
            ocVar.u = selectedItemPosition;
            ocVar.t = true;
            tc create = scVar.create();
            this.a = create;
            AlertController$RecycleListView alertController$RecycleListView = create.Y.g;
            alertController$RecycleListView.setTextDirection(i);
            alertController$RecycleListView.setTextAlignment(i2);
            this.a.show();
        }
    }

    public final int o() {
        return 0;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bo boVar = this.o;
        boVar.setSelection(i);
        if (boVar.getOnItemClickListener() != null) {
            boVar.performItemClick((View) null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    public final void p(ListAdapter listAdapter) {
        this.b = listAdapter;
    }
}
