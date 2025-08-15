package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: cpf  reason: default package */
public final class cpf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ TextView Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cpf(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.Y = textView;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cpf) n((fka) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cpf cpf = new cpf(this.Y, continuation);
        cpf.X = obj;
        return cpf;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        fka fka = (fka) this.X;
        CharSequence text = this.Y.getText();
        if (text != null) {
            xfg.c(text, fka);
        }
        return e5f.a;
    }
}
