package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: y7f  reason: default package */
public final class y7f implements qj3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y7f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((UploadFileAttachWorker) this.b).e((Throwable) obj);
                return;
            default:
                ((Number) obj).longValue();
                ax axVar = (ax) this.b;
                bkb bkb = (bkb) axVar.b;
                aab aab = (aab) bkb.a;
                py3 py3 = null;
                if (((Number) ((khe) aab.b).getValue()).longValue() > 0 && ((Number) ((khe) aab.a).getValue()).longValue() > 0) {
                    abg abg = (abg) bkb.c;
                    z9b k = aab.k();
                    abg abg2 = k == null ? null : new abg(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), k);
                    z9b k2 = aab.k();
                    bkb.c = k2 == null ? null : new abg(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), k2);
                    if (!(abg == null || abg2 == null)) {
                        z9b z9b = abg2.b;
                        long j = z9b.b + z9b.c + z9b.d;
                        khe khe = (khe) bkb.b;
                        float floatValue = ((float) (z9b.a + j)) / ((Number) khe.getValue()).floatValue();
                        z9b z9b2 = abg.b;
                        float floatValue2 = floatValue - (((float) (z9b2.a + (z9b2.b + (z9b2.c + z9b2.d)))) / ((Number) khe.getValue()).floatValue());
                        float floatValue3 = (((float) abg2.a) - (((float) z9b.e) / ((Number) khe.getValue()).floatValue())) - (((float) abg.a) - (((float) z9b2.e) / ((Number) khe.getValue()).floatValue()));
                        if (!Float.isInfinite(floatValue3) && !Float.isNaN(floatValue3) && floatValue3 != 0.0f) {
                            float longValue = (floatValue2 / floatValue3) / ((float) ((Number) ((khe) aab.a).getValue()).longValue());
                            if (0.0f <= longValue && longValue <= 1.0f) {
                                py3 = new py3(longValue);
                            }
                        }
                    }
                }
                axVar.o = py3;
                return;
        }
    }

    public y7f(ViewGroup viewGroup) {
        this.a = 1;
        this.b = viewGroup.getOverlay();
    }
}
