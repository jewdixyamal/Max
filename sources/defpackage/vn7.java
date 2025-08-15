package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: vn7  reason: default package */
public final class vn7 extends hu3 {
    public ay4 X;
    public oke Y;
    public LoadEmojiFontWorker Z;
    public LoadEmojiFontWorker o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ LoadEmojiFontWorker t0;
    public int u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn7(LoadEmojiFontWorker loadEmojiFontWorker, Continuation continuation) {
        super(continuation);
        this.t0 = loadEmojiFontWorker;
    }

    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.doForegroundWork(this);
    }
}
