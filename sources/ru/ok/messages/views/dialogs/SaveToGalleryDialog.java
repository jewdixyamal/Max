package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/SaveToGalleryDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class SaveToGalleryDialog extends FrgDlgBase {
    public static final SaveToGalleryDialog n1(String str, boolean z) {
        SaveToGalleryDialog saveToGalleryDialog = new SaveToGalleryDialog();
        saveToGalleryDialog.X0(dy7.g(new kpa("ru.ok.tamtam.extra.EXTRA_URL", str), new kpa("ru.ok.tamtam.extra.EXTRA_GIF", Boolean.valueOf(z))));
        return saveToGalleryDialog;
    }

    public final Dialog h1() {
        sme sme;
        if (wmd.l(b0())) {
            p1();
        } else {
            wmd.D(this, wmd.s(), 157);
        }
        LayoutInflater layoutInflater = this.Z0;
        if (layoutInflater == null) {
            layoutInflater = R0();
        }
        View inflate = layoutInflater.inflate(yyb.dialog_progress_with_text, (ViewGroup) null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(xxb.dialog_progress__text);
        appCompatTextView.setText(h0(jpc.u2));
        if (appCompatTextView.isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context = appCompatTextView.getContext();
            khe khe = sme.a0;
            sme = fm9.R(context);
        }
        appCompatTextView.setTextColor(sme.F);
        return new s08(U0()).f(inflate).a();
    }

    public final void m1(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            q5 q5Var = (b0() == null || b0().isFinishing()) ? null : (q5) b0();
            if (q5Var != null) {
                if (wmd.N(q5Var, (a) null, strArr, iArr, wmd.s(), jpc.g2, jpc.f2)) {
                    p1();
                    return;
                }
            }
            e1();
        }
    }

    public final void o1(boolean z) {
        ed3 ed3;
        zp zpVar;
        y7g y7g = this.E1;
        if (!(y7g == null || (ed3 = (ed3) y7g.b) == null || (zpVar = (zp) ((y8a) ed3).getAccessor().c(zp.class)) == null || !((lqf) zpVar).c())) {
            a14.N(0, U0(), h0(z ? jpc.w2 : jpc.v2));
        }
        e1();
    }

    public final void p1() {
        String string = T0().getString("ru.ok.tamtam.extra.EXTRA_URL");
        if (string == null) {
            o1(false);
            return;
        }
        j47.T(f46.J(this), (lx3) null, (vx3) null, new krc(this, string, T0().getBoolean("ru.ok.tamtam.extra.EXTRA_GIF"), (Continuation) null), 3);
    }
}
