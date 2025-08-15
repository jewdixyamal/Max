package defpackage;

import com.google.android.gms.tasks.Task;

/* renamed from: ne6  reason: default package */
public final /* synthetic */ class ne6 implements l3a, o3a {
    public final /* synthetic */ pr7 a;

    public /* synthetic */ ne6(pr7 pr7) {
        this.a = pr7;
    }

    public void l(Task task) {
        boolean h = task.h();
        pr7 pr7 = this.a;
        if (h) {
            pr7.f();
        } else {
            pr7.g((Exception) null);
        }
    }

    public void onFailure(Exception exc) {
        this.a.g(exc);
    }
}
