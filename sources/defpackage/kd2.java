package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;

/* renamed from: kd2  reason: default package */
public final class kd2 extends mw7 {
    public final /* synthetic */ je7 g;
    public final /* synthetic */ je7 h;
    public final /* synthetic */ ld2 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kd2(je7 je7, je7 je72, ld2 ld2) {
        super(100);
        this.g = je7;
        this.h = je72;
        this.i = ld2;
    }

    public final Object a(Object obj) {
        Object obj2;
        hd2 hd2 = (hd2) obj;
        je7 je7 = this.g;
        je7 je72 = this.h;
        ld2 ld2 = this.i;
        CharSequence charSequence = null;
        try {
            String d = ((mz6) je7.getValue()).d(hd2.a);
            if (d != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(((ida) je72.getValue()).j.e(eae.g0(d)), new mse(qp4.u0.b(ld2.a).i(), new we1(16)), 33);
                tpa.d(spannableStringBuilder, 8203, new bvd(tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density) + tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density)), 33);
                obj2 = new SpannedString(spannableStringBuilder);
            } else {
                obj2 = null;
            }
        } catch (Throwable th) {
            obj2 = new njc(th);
        }
        Throwable a = pjc.a(obj2);
        if (a != null) {
            hm9.p(ld2.u, "Fail process typing", a);
        }
        if (!(obj2 instanceof njc)) {
            charSequence = obj2;
        }
        return charSequence;
    }
}
