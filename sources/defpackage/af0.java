package defpackage;

import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: af0  reason: default package */
public final /* synthetic */ class af0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BacklogWorker b;

    public /* synthetic */ af0(BacklogWorker backlogWorker, int i) {
        this.a = i;
        this.b = backlogWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((jyc) this.b.getTamComponent()).s();
            default:
                return (v7g) ((jyc) this.b.getTamComponent()).getAccessor().c(v7g.class);
        }
    }
}
