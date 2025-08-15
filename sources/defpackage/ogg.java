package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: ogg  reason: default package */
public final class ogg implements zjg, x3a, o3a, k3a {
    public final /* synthetic */ int a;
    public final Executor b;
    public final fu3 c;
    public final ukg o;

    public /* synthetic */ ogg(Executor executor, fu3 fu3, ukg ukg, int i) {
        this.a = i;
        this.b = executor;
        this.c = fu3;
        this.o = ukg;
    }

    public void a(Object obj) {
        this.o.n(obj);
    }

    public final void b(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new u8g(this, 2, task));
                return;
            default:
                this.b.execute(new ihg((zjg) this, task, 0));
                return;
        }
    }

    public void d() {
        this.o.o();
    }

    public void onFailure(Exception exc) {
        this.o.m(exc);
    }
}
