package ru.ok.messages.views.dialogs;

import android.app.Dialog;

public class FrgDlgStopLiveLocation extends FrgDlgChecked<x46> {
    public final Dialog h1() {
        e52 C = ((y8a) vl.b()).e().C(this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID"));
        s08 s08 = new s08(U0());
        C.k0();
        s08 e = s08.e(C.u0);
        e.b(jpc.r0);
        s08 c = e.c(dpc.D, new p46(this, C, 3));
        int i = jpc.r;
        d10 d10 = new d10(2, this);
        oc ocVar = c.a;
        ocVar.k = ocVar.a.getText(i);
        ocVar.l = d10;
        return c.a();
    }

    public final Class n1() {
        return x46.class;
    }
}
