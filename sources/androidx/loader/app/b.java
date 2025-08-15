package androidx.loader.app;

import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;

public final class b {
    public final eh7 a;
    public final LoaderManagerImpl$LoaderViewModel b;

    public b(eh7 eh7, xnf xnf) {
        this.a = eh7;
        this.b = (LoaderManagerImpl$LoaderViewModel) new xje(xnf, (vnf) LoaderManagerImpl$LoaderViewModel.d).b(nec.a(LoaderManagerImpl$LoaderViewModel.class));
    }

    public final void a(String str, PrintWriter printWriter) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.b.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i = 0;
            while (true) {
                kvd kvd = loaderManagerImpl$LoaderViewModel.b;
                if (i < kvd.c) {
                    mo7 mo7 = (mo7) kvd.b[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(loaderManagerImpl$LoaderViewModel.b.a[i]);
                    printWriter.print(": ");
                    printWriter.println(mo7.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(mo7.l);
                    printWriter.print(" mArgs=");
                    printWriter.println(mo7.m);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(mo7.n);
                    rgg rgg = mo7.n;
                    String g = au1.g(str2, "  ");
                    rgg.getClass();
                    printWriter.print(g);
                    printWriter.print("mId=");
                    printWriter.print(rgg.a);
                    printWriter.print(" mListener=");
                    printWriter.println(rgg.b);
                    if (rgg.c || rgg.f) {
                        printWriter.print(g);
                        printWriter.print("mStarted=");
                        printWriter.print(rgg.c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(rgg.f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (rgg.d || rgg.e) {
                        printWriter.print(g);
                        printWriter.print("mAbandoned=");
                        printWriter.print(rgg.d);
                        printWriter.print(" mReset=");
                        printWriter.println(rgg.e);
                    }
                    if (rgg.h != null) {
                        printWriter.print(g);
                        printWriter.print("mTask=");
                        printWriter.print(rgg.h);
                        printWriter.print(" waiting=");
                        rgg.h.getClass();
                        printWriter.println(false);
                    }
                    if (rgg.i != null) {
                        printWriter.print(g);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(rgg.i);
                        printWriter.print(" waiting=");
                        rgg.i.getClass();
                        printWriter.println(false);
                    }
                    if (mo7.p != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(mo7.p);
                        no7 no7 = mo7.p;
                        no7.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(no7.b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    rgg rgg2 = mo7.n;
                    Object d = mo7.d();
                    rgg2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    z04.g(sb, d);
                    sb.append("}");
                    printWriter.println(sb.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    printWriter.println(mo7.c > 0);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final rgg b(wmc wmc) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            mo7 mo7 = (mo7) loaderManagerImpl$LoaderViewModel.b.c(0);
            eh7 eh7 = this.a;
            if (mo7 == null) {
                Class<rgg> cls = rgg.class;
                try {
                    loaderManagerImpl$LoaderViewModel.c = true;
                    SignInHubActivity signInHubActivity = (SignInHubActivity) wmc.a;
                    Set set = mdg.b;
                    synchronized (set) {
                    }
                    rgg rgg = new rgg(signInHubActivity, set);
                    if (cls.isMemberClass()) {
                        if (!Modifier.isStatic(cls.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + rgg);
                        }
                    }
                    mo7 mo72 = new mo7(rgg);
                    loaderManagerImpl$LoaderViewModel.b.d(0, mo72);
                    loaderManagerImpl$LoaderViewModel.c = false;
                    rgg rgg2 = mo72.n;
                    no7 no7 = new no7(rgg2, wmc);
                    mo72.e(eh7, no7);
                    no7 no72 = mo72.p;
                    if (no72 != null) {
                        mo72.j(no72);
                    }
                    mo72.o = eh7;
                    mo72.p = no7;
                    return rgg2;
                } catch (Throwable th) {
                    loaderManagerImpl$LoaderViewModel.c = false;
                    throw th;
                }
            } else {
                rgg rgg3 = mo7.n;
                no7 no73 = new no7(rgg3, wmc);
                mo7.e(eh7, no73);
                no7 no74 = mo7.p;
                if (no74 != null) {
                    mo7.j(no74);
                }
                mo7.o = eh7;
                mo7.p = no73;
                return rgg3;
            }
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void c() {
        kvd kvd = this.b.b;
        int i = kvd.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mo7) kvd.b[i2]).l();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        z04.g(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}
