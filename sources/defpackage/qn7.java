package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: qn7  reason: default package */
public final class qn7 {
    public static void a(v7g v7g, boolean z) {
        hm9.m(LoadEmojiFontWorker.TAG, "start", new Object[0]);
        qla qla = (qla) new qla(LoadEmojiFontWorker.class).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = z ? 2 : 3;
        kpa[] kpaArr = {new kpa(LoadEmojiFontWorker.WAITING_FOR_WIFI, Boolean.valueOf(z))};
        qqd qqd = new qqd(9, (byte) 0);
        kpa kpa = kpaArr[0];
        qqd.A(kpa.b, (String) kpa.a);
        rla rla = (rla) ((qla) ((qla) ((qla) ((qla) qla.setConstraints(new kj3(i, false, false, false, false, -1, -1, x53.H0(linkedHashSet)))).setExpedited(jna.a)).addTag(LoadEmojiFontWorker.TAG)).setInputData(qqd.p())).build();
        UUID id = rla.getId();
        hm9.m(LoadEmojiFontWorker.TAG, "work " + id, new Object[0]);
        v7g.b(LoadEmojiFontWorker.TAG, h65.b, rla, false).l();
    }
}
