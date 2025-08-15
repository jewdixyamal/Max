package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import androidx.fragment.app.c;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.dialogs.ProgressDialog;

/* renamed from: gg5  reason: default package */
public final /* synthetic */ class gg5 implements qj3, b7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg5 b;

    public /* synthetic */ gg5(jg5 jg5, int i) {
        this.a = i;
        this.b = jg5;
    }

    public void accept(Object obj) {
        ProgressDialog progressDialog;
        jg5 jg5 = this.b;
        switch (this.a) {
            case 0:
                l20 l20 = (l20) obj;
                if (jg5.a()) {
                    int i = (int) l20.q;
                    c cVar = ((FrgAttachVideo) jg5.d).F0;
                    if (cVar != null && (progressDialog = (ProgressDialog) cVar.E("ru.ok.messages.views.dialogs.ProgressDialog")) != null) {
                        ((ProgressBar) progressDialog.i1().findViewById(xxb.dialog_progress__progress)).setProgress(i);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gua gua = (gua) obj;
                if (oag.t(jg5.j) || !wmd.M(gua.b, gua.c, wmd.s())) {
                    jg5.j = null;
                    jg5.k = false;
                    jg5.m = false;
                    jg5.l = 0;
                    return;
                }
                jg5.d(jg5.j, jg5.k);
                return;
            default:
                l20 l202 = (l20) obj;
                if (jg5.a()) {
                    ((FrgAttachVideo) jg5.d).j1();
                    if (sme.b(l202.j.c, false)) {
                        jg5.e.f("ACTION_THEME_SHARE_EXTERNAL");
                    }
                    kk5 kk5 = jg5.g;
                    File h = kk5.h(l202);
                    Context d0 = jg5.c.d0();
                    if (d0 != null) {
                        ArrayList arrayList = hm9.l;
                        try {
                            Uri f = kk5.f(d0, h);
                            die die = new die(d0, 13);
                            ((Intent) die.b).setType("*/*");
                            die.Q(f);
                            die.R((CharSequence) null);
                            die.S();
                            return;
                        } catch (Exception e) {
                            hm9.p("hm9", "shareFile error", e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public boolean test(Object obj) {
        es8 es8 = (es8) obj;
        jg5 jg5 = this.b;
        jg5.getClass();
        cu8 cu8 = es8.a;
        return cu8.b == jg5.i && cu8.n() && es8.a.g() != null;
    }
}
