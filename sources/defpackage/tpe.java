package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: tpe  reason: default package */
public final class tpe {
    public final Context a;
    public final zaa b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public tpe(kke kke, Context context, zaa zaa) {
        this.a = context;
        this.b = zaa;
        od2.L(new zn5(new j31((w7c) qp4.u0.b(context).t0, new jp5(zaa.a, 0), new ffe(3, (Continuation) null), 4), new spe(this, (Continuation) null), 5), j1e.a(((w9a) kke).a()));
    }

    public final TextPaint a(kqe kqe) {
        ConcurrentHashMap concurrentHashMap = this.c;
        Object obj = concurrentHashMap.get(kqe);
        TextPaint textPaint = obj;
        if (obj == null) {
            TextPaint textPaint2 = new TextPaint();
            kqe.a(textPaint2, this.a.getResources().getDisplayMetrics(), (du4) this.b.a.getValue());
            Object putIfAbsent = concurrentHashMap.putIfAbsent(kqe, textPaint2);
            textPaint = textPaint2;
            if (putIfAbsent != null) {
                textPaint = putIfAbsent;
            }
        }
        return (TextPaint) textPaint;
    }
}
