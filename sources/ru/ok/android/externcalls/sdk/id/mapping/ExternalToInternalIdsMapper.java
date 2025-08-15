package ru.ok.android.externcalls.sdk.id.mapping;

import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 )2\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001)B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00140\u00102\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J/\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00142\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u001a\u0010\u001c\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020 2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b!\u0010\"J5\u0010$\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050#2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(¨\u0006*"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/ExternalToInternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lq2a;", "okApi", "Lag1;", "callParams", "La4c;", "rtcLog", "<init>", "(Lq2a;Lag1;La4c;)V", "", "from", "", "filterEmptyParticipantIds", "(Ljava/util/Collection;)Ljava/util/List;", "candidates", "Lsk0;", "Lru/ok/android/externcalls/sdk/api/BatchInternalIdResponse;", "kotlin.jvm.PlatformType", "getBatchedResolveInternalIdsRequests", "getResolveInternalIdsRequestsForCandidates", "(Ljava/util/List;)Lsk0;", "response", "", "ids", "Le5f;", "applyInternalIds", "(Lru/ok/android/externcalls/sdk/api/BatchInternalIdResponse;Ljava/util/Map;)V", "", "constructRequestIdsParameter", "(Ljava/util/List;)Ljava/lang/String;", "", "map", "(Ljava/util/Collection;)Ljava/util/Map;", "Lq2a;", "Lag1;", "La4c;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ExternalToInternalIdsMapper implements IdsMapper<ParticipantId, bg1> {
    public static final Companion Companion = new Companion((z84) null);
    private static final String LOG_TAG = "ExternalToInternalIdsMapper";
    private static final int MAX_RESOLUTION_CANDIDATES_PER_REQUEST = 100;
    private final ag1 callParams;
    private final q2a okApi;
    private final a4c rtcLog;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/ExternalToInternalIdsMapper$Companion;", "", "()V", "LOG_TAG", "", "MAX_RESOLUTION_CANDIDATES_PER_REQUEST", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public ExternalToInternalIdsMapper(q2a q2a, ag1 ag1, a4c a4c) {
        this.okApi = q2a;
        this.callParams = ag1;
        this.rtcLog = a4c;
    }

    private final void applyInternalIds(BatchInternalIdResponse batchInternalIdResponse, Map<ParticipantId, bg1> map) {
        if (batchInternalIdResponse != null) {
            Map<ParticipantId, bg1> map2 = batchInternalIdResponse.externalToInternalIdsMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map2.entrySet()) {
                ParticipantId participantId = (ParticipantId) next.getKey();
                bg1 bg1 = (bg1) next.getValue();
                if (!(participantId == null || bg1 == null)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            map.putAll(linkedHashMap);
        }
    }

    private final String constructRequestIdsParameter(List<ParticipantId> list) {
        JSONArray jSONArray = new JSONArray();
        for (ParticipantId participantId : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) participantId.id);
            jSONObject.put("ok_anonym", participantId.isAnon);
            jSONArray.put((Object) jSONObject);
        }
        return jSONArray.toString();
    }

    private final List<ParticipantId> filterEmptyParticipantIds(Collection<ParticipantId> collection) {
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            ParticipantId participantId = (ParticipantId) next;
            if (participantId.id.length() == 0) {
                this.rtcLog.reportException(LOG_TAG, "Empty participant id", new IllegalArgumentException("Empty participant id"));
            }
            if (participantId.id.length() > 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final List<sk0> getBatchedResolveInternalIdsRequests(Collection<ParticipantId> collection) {
        ArrayList I0 = x53.I0(collection, 100, 100);
        ArrayList arrayList = new ArrayList(z53.S(I0, 10));
        Iterator it = I0.iterator();
        while (it.hasNext()) {
            arrayList.add(getResolveInternalIdsRequestsForCandidates((List) it.next()));
        }
        return arrayList;
    }

    private final sk0 getResolveInternalIdsRequestsForCandidates(List<ParticipantId> list) {
        rk0 s = tu0.s("vchat.getOkIdsByExternalIds");
        s.b = kl.c;
        s.c.a(new u9e(ApiProtocol.PARAM_EXTERNAL_IDS, constructRequestIdsParameter(list)));
        return s.a(BatchInternalIdResponse.PARSER);
    }

    public Map<ParticipantId, bg1> map(Collection<ParticipantId> collection) {
        boolean z = jb9.a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            List<ParticipantId> filterEmptyParticipantIds = filterEmptyParticipantIds(collection);
            if (filterEmptyParticipantIds.isEmpty()) {
                return oz4.a;
            }
            List<sk0> batchedResolveInternalIdsRequests = getBatchedResolveInternalIdsRequests(filterEmptyParticipantIds);
            Uri uri = bl0.X;
            ArrayList arrayList = new ArrayList();
            for (sk0 next : batchedResolveInternalIdsRequests) {
                arrayList.add(new il(next, next));
            }
            cl0 cl0 = (cl0) RetryKt.retryApiCallForFastWorkRequired(this.okApi.c().a(new bl0((String) null, (il[]) arrayList.toArray(new il[0]), 0)), this.callParams.B.h, this.rtcLog).e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (sk0 a : batchedResolveInternalIdsRequests) {
                applyInternalIds((BatchInternalIdResponse) cl0.a(a), linkedHashMap);
            }
            return linkedHashMap;
        }
        throw new IllegalStateException("Background thread expected");
    }
}
