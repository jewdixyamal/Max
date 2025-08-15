package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: l09  reason: default package */
public final class l09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l09 l09 = new l09(continuation, this.Y);
        l09.X = obj;
        return l09;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        rce rce = (rce) this.X;
        int i = rce.Z;
        e5f e5f = e5f.a;
        e5f e5f2 = null;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (i == 3) {
            bc7[] bc7Arr = MessageWriteWidget.F0;
            xz8 v0 = messageWriteWidget.v0();
            CharSequence k = rce.k();
            bc7[] bc7Arr2 = xz8.V0;
            v0.B(k, false);
            messageWriteWidget.q0().setText((CharSequence) null);
        } else {
            bc7[] bc7Arr3 = MessageWriteWidget.F0;
            yce w0 = messageWriteWidget.w0();
            w0.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rce.k().toString());
            int i2 = mce.X;
            tce tce = new tce(w0, 0);
            spannableStringBuilder.toString();
            spannableStringBuilder.setSpan(new mce(w0.c, rce, tce), 0, spannableStringBuilder.length(), 17);
            CharSequence b = ((ida) w0.A0.getValue()).b(spannableStringBuilder, new nu8(rce.a, (String) null, mu8.a, 0, spannableStringBuilder.length(), (Map) null), false, true);
            ph4 ph4 = messageWriteWidget.w0().o;
            sv8 q0 = messageWriteWidget.q0();
            ph4.getClass();
            int intValue = ((Number) q0.getMessagePosition().getValue()).intValue();
            CharSequence text = q0.getText();
            SpannableString valueOf = text != null ? SpannableString.valueOf(text) : null;
            mce k2 = valueOf != null ? ph4.k(valueOf, intValue, rce) : null;
            qv8 qv8 = q0.c;
            if (!(valueOf == null || k2 == null)) {
                int spanStart = valueOf.getSpanStart(k2);
                int spanEnd = valueOf.getSpanEnd(k2);
                Editable text2 = qv8.getText();
                if (text2 != null) {
                    text2.replace(spanStart, spanEnd, b, 0, b.length());
                }
                Editable text3 = qv8.getText();
                if (text3 == null) {
                    q0.setText(" ");
                } else {
                    text3.append(" ");
                }
                e5f2 = e5f;
            }
            if (e5f2 == null) {
                int length = rce.X.length();
                Editable text4 = qv8.getText();
                if (text4 != null) {
                    int max = Math.max(qv8.getSelectionStart(), 0);
                    text4.replace(Math.max(max - length, 0), max, b, 0, b.length());
                }
                Editable text5 = qv8.getText();
                if (text5 == null) {
                    q0.setText(" ");
                } else {
                    text5.append(" ");
                }
            }
        }
        return e5f;
    }
}
