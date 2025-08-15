package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: gig  reason: default package */
public final class gig implements zjg, x3a, o3a, k3a {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object o;

    public gig(Executor executor, k3a k3a) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.o = k3a;
    }

    public void a(Object obj) {
        ((ukg) this.o).n(obj);
    }

    public final void b(Task task) {
        switch (this.a) {
            case 0:
                if (((ukg) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((k3a) this.o) != null) {
                                this.b.execute(new gwe(15, (Object) this));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 1:
                synchronized (this.c) {
                    try {
                        if (((l3a) this.o) != null) {
                            this.b.execute(new u8g(this, 4, task));
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
            case 2:
                if (!task.h() && !((ukg) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((o3a) this.o) != null) {
                                this.b.execute(new ihg((zjg) this, task, 2));
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            while (true) {
                                throw th3;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 3:
                if (task.h()) {
                    synchronized (this.c) {
                        try {
                            if (((x3a) this.o) != null) {
                                this.b.execute(new u8g(this, 5, task));
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            while (true) {
                                throw th4;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            default:
                this.b.execute(new u8g(this, 6, task));
                return;
        }
    }

    public void d() {
        ((ukg) this.o).o();
    }

    public void onFailure(Exception exc) {
        ((ukg) this.o).m(exc);
    }

    public gig(Executor executor, l3a l3a) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.o = l3a;
    }

    public gig(Executor executor, o3a o3a) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.o = o3a;
    }

    public gig(Executor executor, x3a x3a) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.o = x3a;
    }

    public gig(Executor executor, sbe sbe, ukg ukg) {
        this.a = 4;
        this.b = executor;
        this.c = sbe;
        this.o = ukg;
    }
}
