package ru.ok.messages.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBase;

public abstract class FrgBaseSettings extends FrgBase {
    public List B1;
    public eed C1;
    public RecyclerView D1;

    public final void m1(q5 q5Var) {
        this.n1 = false;
        if (!(q5Var instanceof jgd)) {
            throw new IllegalStateException("FrgBaseSettings must be attach to activity that implements SettingsListener");
        }
    }

    public abstract ArrayList r1();

    public abstract String s1();

    public abstract void t1(int i);

    public abstract void u1(int i, Object obj);

    public final void v1() {
        this.B1.clear();
        this.B1.addAll(r1());
        if (this.D1.Z()) {
            this.D1.post(new dd4(28, this));
        } else {
            this.C1.m();
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ai3 h1 = h1();
        if (h1 != null) {
            h1.g(s1());
        }
        View inflate = layoutInflater.inflate(yyb.frg_settings_base, viewGroup, false);
        inflate.setBackgroundColor(this.r1.m);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(xxb.frg_settings__rv_content);
        this.D1 = recyclerView;
        d0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.B1 = r1();
        eed eed = new eed(b0(), this.B1, this);
        this.C1 = eed;
        this.D1.setAdapter(eed);
        return inflate;
    }
}
