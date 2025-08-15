package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: xk9  reason: default package */
public final class xk9 extends v2 implements nse, kk9 {
    public RecyclerView X;
    public ProgressBar Y;
    public TextView Z;
    public final ida o;
    public kn7 s0;

    public xk9(Context context, ViewGroup viewGroup, ida ida) {
        super(context);
        this.o = ida;
        l(viewGroup, yyb.frg_live_location_settings);
    }

    public final void A(boolean z) {
        if (z) {
            this.Y.setVisibility(0);
        } else {
            this.Y.setVisibility(8);
        }
    }

    public final void B(List list) {
        if (list.isEmpty()) {
            this.Z.setVisibility(0);
            this.X.setVisibility(8);
            return;
        }
        kn7 kn7 = this.s0;
        kn7.X = list;
        kn7.m();
        this.Z.setVisibility(8);
        this.X.setVisibility(0);
    }

    public final void c() {
        Context context = ((View) this.c).getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        ((View) this.c).setBackgroundColor(R.m);
        ngg.H(this.Y, R.k);
        this.Z.setTextColor(R.F);
    }

    public final void m() {
        this.X = (RecyclerView) ((View) this.c).findViewById(xxb.frg_live_location_settings__rv_chats);
        this.Y = (ProgressBar) ((View) this.c).findViewById(xxb.frg_live_location_settings__pb_loading);
        this.Z = (TextView) ((View) this.c).findViewById(xxb.frg_live_location_settings__tv_empty);
        kn7 kn7 = new kn7(this.o, Collections.emptyList());
        this.s0 = kn7;
        this.X.setAdapter(kn7);
        this.X.setLayoutManager(new LinearLayoutManager(1, false));
        this.X.setHasFixedSize(true);
    }
}
