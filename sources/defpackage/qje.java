package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: qje  reason: default package */
public final class qje implements qj3, l3a {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qje(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((UploadDraftMediaWorker) this.b).e((Throwable) obj);
                return;
            default:
                hm9.m("v7g", "initialized!", new Object[0]);
                int i = 1;
                ((v7g) this.b).h = true;
                ((v7g) this.b).i((p7g) obj);
                p7g h = ((v7g) this.b).h();
                qyc qyc = (qyc) ((v7g) this.b).c;
                qyc.getClass();
                int q = (int) qyc.q(PmsKey.f138wmbacklogworkerbackoffdelaysec, (long) 10);
                if (q >= 1) {
                    i = q;
                }
                xfg.B(h, Integer.valueOf(i), (q8g) null);
                return;
        }
    }

    public void l(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    public qje() {
        this.a = 0;
        this.b = new ConcurrentHashMap();
    }
}
