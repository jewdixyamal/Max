package ru.ok.android.externcalls.sdk.stereo.internal.command;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.externcalls.sdk.stereo.exception.ParticipantNotFoundException;
import ru.ok.android.externcalls.sdk.stereo.exception.PromotedLimitExceeded;
import ru.ok.android.externcalls.sdk.stereo.exception.StereoRoomException;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010#\u001a\u00020\u000e2$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u000e0\u001e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "La4c;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;La4c;)V", "", "method", "Lorg/json/JSONObject;", "errorResponse", "Lkotlin/Function1;", "", "Le5f;", "onError", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "params", "Lkotlin/Function0;", "onSuccess", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "requestPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "acceptPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;Lk56;Lm56;)V", "Lkotlin/Function3;", "", "", "", "Llp1;", "getHandsQueue", "(Lc66;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "La4c;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StereoRoomCommandExecutorImpl implements StereoRoomCommandExecutor {
    private final a4c log;
    private final SignalingProvider signalingProvider;

    public StereoRoomCommandExecutorImpl(SignalingProvider signalingProvider2, a4c a4c) {
        this.signalingProvider = signalingProvider2;
        this.log = a4c;
    }

    /* access modifiers changed from: private */
    public static final void acceptPromotion$lambda$4(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void acceptPromotion$lambda$5(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("acceptPromotion", jSONObject, m56);
    }

    /* access modifiers changed from: private */
    public static final void getHandsQueue$lambda$8(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56, c66 c66, JSONObject jSONObject) {
        cq1 a = new dq1(stereoRoomCommandExecutorImpl.log).a(jSONObject);
        if (a != null) {
            Integer valueOf = Integer.valueOf(a.c);
            Boolean valueOf2 = Boolean.valueOf(a.b);
            List<kp1> list = a.a;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (kp1 kp1 : list) {
                arrayList.add(kp1.a);
            }
            c66.invoke(valueOf, valueOf2, arrayList);
        } else if (m56 != null) {
            m56.invoke(new StereoRoomException("getHandsQueue: missing response", (Throwable) null, 2, (z84) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void getHandsQueue$lambda$9(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("getHandQueue", jSONObject, m56);
    }

    private final void parseErrorResponse(String str, JSONObject jSONObject, m56 m56) {
        Object obj;
        String optString = jSONObject.optString("error");
        if (tpa.f(optString, "chatRoom.partNotFound")) {
            obj = new ParticipantNotFoundException("Participant not found, " + str + " command " + jSONObject);
        } else if (tpa.f(optString, "chatRoom.promotedLimit")) {
            obj = new PromotedLimitExceeded();
        } else {
            obj = new StereoRoomException("Error response for " + str + " command " + jSONObject, (Throwable) null, 2, (z84) null);
        }
        if (m56 != null) {
            m56.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final void promoteParticipant$lambda$0(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void promoteParticipant$lambda$1(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("promoteParticipant", jSONObject, m56);
    }

    /* access modifiers changed from: private */
    public static final void requestPromotion$lambda$2(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void requestPromotion$lambda$3(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        stereoRoomCommandExecutorImpl.parseErrorResponse("requestPromotion", jSONObject, m56);
    }

    public void acceptPromotion(StereoRoomCommandExecutor.AcceptPromotionParams acceptPromotionParams, k56 k56, m56 m56) {
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            boolean reject = acceptPromotionParams.getReject();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "accept-promotion");
            jSONObject.put("reject", reject);
            rod.d(new ka6(jSONObject), false, new mt(14, k56), new c2e(this, m56, 2));
        }
    }

    public void getHandsQueue(c66 c66, m56 m56) {
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "get-hand-queue");
            rod.d(new ka6(jSONObject), false, new hy0(this, m56, c66, 5), new c2e(this, m56, 0));
        }
    }

    public void promoteParticipant(StereoRoomCommandExecutor.PromoteParticipantParams promoteParticipantParams, k56 k56, m56 m56) {
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            rod.d(f46.r(promoteParticipantParams.getParticipantId(), promoteParticipantParams.getPromote()), false, new mt(15, k56), new c2e(this, m56, 3));
        }
    }

    public void requestPromotion(StereoRoomCommandExecutor.RequestPromotionParams requestPromotionParams, k56 k56, m56 m56) {
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            boolean unrequest = requestPromotionParams.getUnrequest();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "request-promotion");
            jSONObject.put("unrequest", unrequest);
            rod.d(new ka6(jSONObject), false, new mt(13, k56), new c2e(this, m56, 1));
        }
    }
}
