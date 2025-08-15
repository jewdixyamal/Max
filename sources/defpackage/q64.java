package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.List;
import javax.inject.Provider;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable;
import ru.ok.android.externcalls.sdk.utils.cancelable.DisposableCancelableKt;
import ru.ok.tamtam.nano.Protos;

/* renamed from: q64  reason: default package */
public final /* synthetic */ class q64 implements lm7, jm7, qj3, ve4, wff, Cancelable, b66, cw7, Provider, Uploader.IdleStateProvider, km7, yy, jm0, km0, mq1, o1d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q64(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(String str, Throwable th) {
        hm9.p(((e3) ((ki5) this.b).b.a).e, str, th);
    }

    public void accept(Object obj) {
        mpb mpb = (mpb) obj;
        bd4 bd4 = (bd4) this.b;
        bd4.getClass();
        hm9.m("bd4", "success connect to host: %s", mpb.f.toString());
        bd4.l(mpb);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 9:
                return new gx4(((gx4) this.b).b, (List) obj);
            default:
                return ((tx4) this.b).e((CharSequence) obj);
        }
    }

    public long b(long j) {
        switch (this.a) {
            case 26:
                qm5 qm5 = (qm5) this.b;
                return maf.k((j * ((long) qm5.f)) / 1000000, 0, qm5.k - 1);
            default:
                qm5 qm52 = (qm5) this.b;
                return oaf.k((j * ((long) qm52.f)) / 1000000, 0, qm52.k - 1);
        }
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        m1f m1f = (m1f) ((o9g) this.b).b;
        m1f.getClass();
        m1f.Y.execute(new vs5(m1f, 28, videoFrameProcessingException));
    }

    public void cancel() {
        DisposableCancelableKt.toCancelable$lambda$0((zl4) this.b);
    }

    public void d() {
        OneMeDraweeView oneMeDraweeView = ((ky4) this.b).G0;
        if (oneMeDraweeView != null) {
            oneMeDraweeView.setVisibility(8);
        }
    }

    public void e(Object obj, sm5 sm5) {
        u65 u65 = (u65) obj;
        SparseArray sparseArray = ((h74) this.b).X;
        SparseBooleanArray sparseBooleanArray = sm5.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a2 = sm5.a(i);
            ed edVar = (ed) sparseArray.get(a2);
            edVar.getClass();
            sparseArray2.append(a2, edVar);
        }
        u65.getClass();
    }

    public Object get() {
        return ((Uploader) this.b).getSink();
    }

    public int i(int i) {
        int l = ((ol7) ((FolderEditScreen) this.b).X.C(i)).l();
        if ((536870911 & l) == 8) {
            return 0;
        }
        if ((536870912 & l) != 0) {
            return 1;
        }
        if ((1073741824 & l) != 0) {
            return 2;
        }
        return (l & Integer.MIN_VALUE) != 0 ? 3 : 4;
    }

    public void invoke(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 1:
                ((u65) obj).getClass();
                hm9.p("u65", "onPlayerError", (PlaybackException) obj2);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((m3b) obj).q((fd8) obj2);
                return;
            case 16:
                ((n3b) obj).S((zz3) obj2);
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((m3b) obj).q(((n75) obj2).a.V0);
                return;
            case 18:
                ((n3b) obj).b0(((o75) obj2).a.Y0);
                return;
            case 19:
                ((m3b) obj).s((e99) obj2);
                return;
            case 20:
                ((n3b) obj).s0((f99) obj2);
                return;
            case 21:
                ((m3b) obj).o((si4) obj2);
                return;
            case 22:
                ((n3b) obj).v((jlf) obj2);
                return;
            default:
                ((ol8) obj).getClass();
                tb8 tb8 = ((lv4) ((mv4) ((dd3) ((x99) obj2).a).a.get(0)).a.get(0)).a;
                return;
        }
    }

    public boolean isIdle() {
        return ((EventQueueCollector.IdleStateProvider) this.b).isIdle();
    }

    public ffc k(int i, rze rze, int[] iArr) {
        ww6 i2 = zw6.i();
        for (int i3 = 0; i3 < rze.a; i3++) {
            int i4 = i;
            rze rze2 = rze;
            int i5 = i3;
            i2.a(new je4(i4, rze2, i5, (oe4) this.b, iArr[i3]));
        }
        return i2.j();
    }

    public String q(lq1 lq1) {
        xs5 xs5 = (xs5) this.b;
        xs5.getClass();
        xs5.b.execute(new vs5(xs5, 0, lq1));
        return "triggerAePrecapture";
    }

    public /* synthetic */ q64(ed edVar, PlaybackException playbackException) {
        this.a = 1;
        this.b = playbackException;
    }

    public /* synthetic */ q64(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}
