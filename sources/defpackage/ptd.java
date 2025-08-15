package defpackage;

import android.text.Editable;

/* renamed from: ptd  reason: default package */
public final class ptd extends dec implements l17 {
    public final int F0;
    public final g17 G0;
    public final eg3 H0;
    public final /* synthetic */ qtd I0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ptd(qtd qtd, int i, g17 g17, eg3 eg3) {
        super(eg3);
        this.I0 = qtd;
        this.F0 = i;
        this.G0 = g17;
        this.H0 = eg3;
    }

    public final String A() {
        Editable text = this.H0.getText();
        String obj = text != null ? text.toString() : null;
        return obj == null ? "" : obj;
    }

    public final void B(String str) {
        eg3 eg3 = this.H0;
        eg3.setText(str);
        eg3.setSelection(eg3.length());
    }
}
