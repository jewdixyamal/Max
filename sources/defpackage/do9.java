package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.Process;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.camera.core.ImageCaptureException;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import one.me.android.media.service.OneMeDownloadService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.AudioTrack;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* renamed from: do9  reason: default package */
public final /* synthetic */ class do9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ do9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        int i;
        int i2 = 7;
        boolean z = false;
        switch (this.a) {
            case 0:
                go9 go9 = (go9) this.b;
                synchronized (go9.c) {
                    i = go9.b;
                }
                ((f84) this.c).a(i);
                return;
            case 1:
                ((g84) this.c).a(((ho9) this.b).i());
                return;
            case 2:
                taa taa = (taa) this.b;
                vo4 vo4 = (vo4) this.c;
                try {
                    Context context = taa.a;
                    HashMap hashMap = xo4.t0;
                    context.startService(new Intent(context, OneMeDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", vo4).putExtra("stop_reason", 0));
                    return;
                } catch (Throwable th) {
                    hm9.p("OneMeDownloadController", "fail to sendAddDownload", th);
                    return;
                }
            case 3:
                ((InputMethodManager) ((lea) this.b).getContext().getSystemService("input_method")).showSoftInput((EditText) this.c, 1);
                return;
            case 4:
                i50 i50 = (i50) this.b;
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) i50.c).get();
                if (viewGroup != null) {
                    viewGroup.removeView((uge) i50.X);
                }
                i50.X = null;
                i50.Y = null;
                pla pla = (pla) ((mec) this.c).a;
                if (pla != null) {
                    pla.b();
                    return;
                }
                return;
            case 5:
                nsa nsa = (nsa) this.b;
                PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) this.c;
                nsa.getClass();
                nsa.l1 = signalingState == PeerConnection.SignalingState.HAVE_REMOTE_OFFER || signalingState == PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER || signalingState == PeerConnection.SignalingState.STABLE;
                if (signalingState == PeerConnection.SignalingState.STABLE) {
                    z = true;
                }
                nsa.m1 = z;
                if (z) {
                    nsa.i("maybeUpdateSenders", new bdg(nsa, 1));
                }
                msa msa = nsa.Z0;
                if (msa != null) {
                    msa.k(nsa, signalingState);
                    return;
                }
                return;
            case 6:
                nsa nsa2 = (nsa) this.b;
                nsa2.getClass();
                PeerConnection.IceConnectionState iceConnectionState = PeerConnection.IceConnectionState.CONNECTED;
                PeerConnection.IceConnectionState iceConnectionState2 = (PeerConnection.IceConnectionState) this.c;
                if (iceConnectionState2 == iceConnectionState) {
                    nsa2.i("maybeUpdateSenders", new bdg(nsa2, 0));
                }
                msa msa2 = nsa2.Z0;
                if (msa2 != null) {
                    msa2.n(nsa2, iceConnectionState2);
                    return;
                }
                return;
            case 7:
                nsa nsa3 = (nsa) this.b;
                if (nsa3.Z0 != null) {
                    for (AudioTrack id : ((MediaStream[]) this.c)[0].audioTracks) {
                        nsa3.Z0.e(id.id());
                    }
                    return;
                }
                return;
            case 8:
                nsa nsa4 = (nsa) this.b;
                msa msa3 = nsa4.Z0;
                if (msa3 != null) {
                    msa3.l(nsa4, (IceCandidate) this.c);
                    return;
                }
                return;
            case 9:
                nsa nsa5 = (nsa) this.b;
                msa msa4 = nsa5.Z0;
                if (msa4 != null) {
                    msa4.h(nsa5, (IceCandidate[]) this.c);
                    return;
                }
                return;
            case 10:
                nsa nsa6 = (nsa) this.b;
                List list = (List) this.c;
                nsa6.getClass();
                try {
                    if (nsa6.V0 != null) {
                        nsa6.K0.log("PCRTCClient", nsa6.toString() + ": peer connection is already created");
                        return;
                    }
                    nsa6.d1 = list;
                    nsa6.t();
                    nsa6.z();
                    nsa6.C0.post(new csa(nsa6, 0));
                    return;
                } catch (Exception e) {
                    nsa6.W0 = true;
                    nsa6.K0.reportException("PCRTCClient", "pc.create", e);
                    throw e;
                }
            case 11:
                dhe dhe = (dhe) this.c;
                lva lva = (lva) this.b;
                lva.getClass();
                try {
                    lva.b(dhe.b, dhe.c, dhe.o);
                    return;
                } catch (Exception e2) {
                    hm9.p("lva", "onSyncSuccess: exception", e2);
                    ((cba) lva.h).c(new HandledException(e2), true);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((j7b) this.b).b((RecyclerView) this.c, 0, 0);
                return;
            case 13:
                try {
                    ((u7b) this.b).g((gi9) this.c);
                    return;
                } catch (Throwable th2) {
                    hm9.p("u7b", "updatePresence failure!", th2);
                    return;
                }
            case Protos.Attaches.Attach.LOCATION /*14*/:
                h8b h8b = (h8b) this.b;
                iee iee = h8b.t;
                kq0.e();
                if (((ax1) this.c) == h8b.c()) {
                    iee.e();
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((g8b) this.b).a((see) this.c);
                return;
            case 16:
                ((q8b) ((sy4) this.b).b).C0.a((see) this.c);
                return;
            case LangUtils.HASH_SEED /*17*/:
                try {
                    ((cm9) this.b).getClass();
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            case 18:
                yhc yhc = ((x9b) this.b).f;
                yhc.getClass();
                kq0.e();
                boolean z2 = yhc.g;
                ov6 ov6 = (ov6) this.c;
                if (z2) {
                    ov6.close();
                    return;
                }
                c54.p("onImageCaptured() must be called before onFinalResult()", yhc.c.b.isDone());
                yhc.a();
                fc0 fc0 = yhc.a;
                fc0.getClass();
                fc0.b.execute(new flc(fc0, 27, ov6));
                return;
            case 19:
                yhc yhc2 = ((x9b) this.b).f;
                yhc2.getClass();
                kq0.e();
                if (!yhc2.g) {
                    fc0 fc02 = yhc2.a;
                    fc02.getClass();
                    fc02.b.execute(new wje(fc02, (Bitmap) this.c));
                    return;
                }
                return;
            case 20:
                yhc yhc3 = ((x9b) this.b).f;
                yhc3.getClass();
                kq0.e();
                if (!yhc3.g) {
                    c54.p("onImageCaptured() must be called before onFinalResult()", yhc3.c.b.isDone());
                    yhc3.a();
                    kq0.e();
                    fc0 fc03 = yhc3.a;
                    fc03.getClass();
                    fc03.b.execute(new flc(fc03, 26, (ImageCaptureException) this.c));
                    return;
                }
                return;
            case 21:
                ((ProfileInstallerInitializer) this.b).getClass();
                khb.a(Looper.getMainLooper()).postDelayed(new nm((Context) this.c, 4), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case 22:
                unb unb = (unb) this.b;
                ts6 ts6 = unb.C0;
                u1d u1d = (u1d) this.c;
                unb.J0 = ts6 == null ? u1d : new pm5(-9223372036854775807L);
                unb.K0 = u1d.f();
                if (unb.Q0 == -1 && u1d.f() == -9223372036854775807L) {
                    z = true;
                }
                unb.L0 = z;
                if (!z) {
                    i2 = 1;
                }
                unb.M0 = i2;
                unb.Z.q(unb.K0, u1d.c(), unb.L0);
                if (!unb.G0) {
                    unb.i();
                    return;
                }
                return;
            case 23:
                vnb vnb = (vnb) this.b;
                us6 us6 = vnb.D0;
                v1d v1d = (v1d) this.c;
                vnb.L0 = us6 == null ? v1d : new wd0(-9223372036854775807L);
                vnb.M0 = v1d.f();
                if (!vnb.S0 && v1d.f() == -9223372036854775807L) {
                    z = true;
                }
                vnb.N0 = z;
                if (!z) {
                    i2 = 1;
                }
                vnb.O0 = i2;
                if (vnb.H0) {
                    vnb.Z.v(vnb.M0, v1d.c(), vnb.N0);
                    return;
                } else {
                    vnb.u();
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                Gson gson = RLottieDrawable.gson;
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.b;
                rLottieDrawable.getClass();
                Iterator it = new ArrayList(rLottieDrawable.E1).iterator();
                while (it.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it.next()).onError((Throwable) this.c);
                }
                return;
            case 25:
                p9c p9c = (p9c) this.b;
                p9c.getClass();
                new c0a(qy9.j((List) this.c), new n9c(p9c, 0)).a();
                return;
            case 26:
                RecordManagerImpl.onRecordStarted$lambda$4((RecordManagerImpl) this.b, (oh1) this.c);
                return;
            case 27:
                ((Executor) this.b).execute((Runnable) this.c);
                return;
            case 28:
                ((nb0) this.b).u0.accept((xkf) this.c);
                return;
            default:
                ((tu0) this.b).x((Typeface) this.c);
                return;
        }
    }
}
