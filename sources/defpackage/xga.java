package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: xga  reason: default package */
public final /* synthetic */ class xga implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eha b;

    public /* synthetic */ xga(eha eha, int i) {
        this.a = i;
        this.b = eha;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.d();
                return;
            case 1:
                eha eha = this.b;
                eha.b();
                bha bha = eha.u0;
                if (bha != null) {
                    bha.p();
                    return;
                }
                return;
            case 2:
                this.b.d();
                return;
            default:
                ((AppCompatEditText) this.b.C0.getValue()).setText((CharSequence) null);
                return;
        }
    }
}
