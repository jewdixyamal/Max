package defpackage;

import java.lang.ref.WeakReference;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: c7c  reason: default package */
public final /* synthetic */ class c7c implements w7d {
    public final /* synthetic */ WeakReference e;

    public /* synthetic */ c7c(WeakReference weakReference) {
        this.e = weakReference;
    }

    public final void a() {
        fic fic;
        ReactionsViewModel reactionsViewModel = (ReactionsViewModel) this.e.get();
        if (reactionsViewModel != null && (fic = reactionsViewModel.r) != null) {
            fic.reset();
        }
    }
}
