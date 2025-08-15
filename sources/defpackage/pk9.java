package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: pk9  reason: default package */
public final class pk9 extends v2 implements nk9, nse, gp3 {
    public static final int D0 = yyb.layout_contact_location;
    public RecyclerView A0;
    public View B0;
    public ip3 C0;
    public final el3 X;
    public final m7b Y;
    public final ViewStub Z;
    public final ida o;
    public final ri4 s0;
    public Group t0;
    public TextView u0;
    public ImageView v0;
    public ProgressBar w0;
    public TextView x0;
    public TextView y0;
    public TextView z0;

    public pk9(Context context, ida ida, el3 el3, m7b m7b, ri4 ri4, ViewStub viewStub) {
        super(context);
        this.o = ida;
        this.X = el3;
        this.Y = m7b;
        this.s0 = ri4;
        this.Z = viewStub;
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            fka j = qp4.u0.j(view);
            ((View) this.c).setBackgroundColor(j.b().l);
            this.u0.setTextColor(j.getText().h);
            this.y0.setTextColor(j.getText().g);
            this.x0.setTextColor(j.getText().g);
            this.z0.setTextColor(j.getText().j);
            pag.I((Drawable) null, (Drawable) null, ngg.u(gpc.d0, j.getIcon().k, (Context) this.b), (Drawable) null, this.z0);
        }
    }

    public final void m() {
        this.t0 = (Group) ((View) this.c).findViewById(xxb.layout_contact_location__current_group);
        TextView textView = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__tv_name);
        this.u0 = textView;
        i4f.m.b(textView, du4.b);
        this.v0 = (ImageView) ((View) this.c).findViewById(xxb.layout_contact_location__iv_live);
        this.w0 = (ProgressBar) ((View) this.c).findViewById(xxb.layout_contact_location__pb_request_location);
        this.x0 = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__iv_update);
        TextView textView2 = this.u0;
        kqe kqe = i4f.p;
        kqe.b(textView2, du4.b);
        this.y0 = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__tv_address);
        kqe.b(this.u0, du4.b);
        this.z0 = (TextView) ((View) this.c).findViewById(xxb.layout_contact_location__tv_route);
        i4f.D.b(this.u0, du4.b);
        this.A0 = (RecyclerView) ((View) this.c).findViewById(xxb.layout_contact_location__rv_markers);
        this.B0 = ((View) this.c).findViewById(xxb.layout_contact_location__separator);
        c();
        ip3 ip3 = new ip3(this.X);
        this.C0 = ip3;
        ip3.Z = this;
        ip3.A(true);
        this.A0.setAdapter(this.C0);
        this.A0.setLayoutManager(new LinearLayoutManager(0, false));
        nd7.h(this.z0, new ok9(this, 0));
        nd7.h((View) this.c, new ok9(this, 1));
    }
}
