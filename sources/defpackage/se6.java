package defpackage;

import com.google.android.gms.tasks.Task;

/* renamed from: se6  reason: default package */
public final /* synthetic */ class se6 implements l3a, o3a, k3a {
    public final /* synthetic */ we6 a;

    public /* synthetic */ se6(we6 we6) {
        this.a = we6;
    }

    public void d() {
        we6 we6 = this.a;
        hm9.m(we6.e, "startRetriever: canceled", new Object[0]);
        we6.h = null;
    }

    public void l(Task task) {
        we6 we6 = this.a;
        hm9.m(we6.e, "retriever is complete", new Object[0]);
        we6.h = null;
    }

    public void onFailure(Exception exc) {
        we6 we6 = this.a;
        hm9.r(we6.e, new Error("startRetriever: failed", exc), (String) null, new Object[0]);
        we6.h = null;
    }
}
