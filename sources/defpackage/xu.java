package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: xu  reason: default package */
public final /* synthetic */ class xu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;
    public final /* synthetic */ vk6 c;

    public /* synthetic */ xu(tf2 tf2, es8 es8, int i) {
        this.a = i;
        this.b = tf2;
        this.c = es8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                vk6 vk6 = this.c;
                tf2 tf2 = this.b;
                tf2.getClass();
                try {
                    tf2.b.b(vk6);
                    return;
                } catch (Throwable th) {
                    hm9.p(tf2.a, "addHistoryItem: exception", th);
                    tf2.Y.a(new HandledException(th));
                    return;
                }
            default:
                vk6 vk62 = this.c;
                tf2 tf22 = this.b;
                tf22.getClass();
                try {
                    tf22.b.r(vk62);
                    return;
                } catch (Throwable th2) {
                    hm9.p(tf22.a, "updateHistoryItemSync: exception", th2);
                    tf22.Y.a(new HandledException(th2));
                    return;
                }
        }
    }
}
