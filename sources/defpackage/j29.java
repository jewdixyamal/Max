package defpackage;

import android.text.TextPaint;

/* renamed from: j29  reason: default package */
public final class j29 extends mw7 {
    public final /* synthetic */ je7 g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j29(int i, je7 je7) {
        super(i);
        this.g = je7;
    }

    public final Object a(Object obj) {
        a3f a3f = (a3f) obj;
        int intValue = ((Number) a3f.a).intValue();
        float floatValue = ((Number) a3f.b).floatValue();
        ((Boolean) a3f.c).getClass();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAntiAlias(true);
        textPaint.setColor(intValue);
        textPaint.setTextSize(floatValue);
        textPaint.linkColor = qp4.u0.b(((w6a) ((os0) this.g.getValue())).a).i().a().d(true).d.b;
        return textPaint;
    }
}
