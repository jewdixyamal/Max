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
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00110\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00112\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u001a\u0010\u001b\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010!\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050 2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lq2a;", "okApi", "Lag1;", "callParams", "La4c;", "logger", "<init>", "(Lq2a;Lag1;La4c;)V", "", "resolutionCandidates", "", "Lsk0;", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "kotlin.jvm.PlatformType", "getBatchedExternalsRequest", "(Ljava/util/Collection;)Ljava/util/List;", "candidates", "getResolveExternalRequestForCandidates", "(Ljava/util/List;)Lsk0;", "response", "", "idsMap", "Le5f;", "applyExternals", "(Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;Ljava/util/Map;)V", "from", "", "map", "(Ljava/util/Collection;)Ljava/util/Map;", "Lq2a;", "Lag1;", "La4c;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class InternalToExternalIdsMapper implements IdsMapper<bg1, ParticipantId> {
    public static final Companion Companion = new Companion((z84) null);
    private static final int MAX_RESOLUTION_CANDIDATES_PER_REQUEST = 200;
    private final ag1 callParams;
    private final a4c logger;
    private final q2a okApi;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper$Companion;", "", "()V", "MAX_RESOLUTION_CANDIDATES_PER_REQUEST", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84) {
            this();
        }
    }

    public InternalToExternalIdsMapper(q2a q2a, ag1 ag1, a4c a4c) {
        this.okApi = q2a;
        this.callParams = ag1;
        this.logger = a4c;
    }

    private final void applyExternals(ExternalIdsResponse externalIdsResponse, Map<bg1, ParticipantId> map) {
        if (externalIdsResponse != null) {
            Map<bg1, ParticipantId> mapping = externalIdsResponse.getMapping();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : mapping.entrySet()) {
                if (!(next.getKey() == null || next.getValue() == null)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            map.putAll(linkedHashMap);
        }
    }

    private final List<sk0> getBatchedExternalsRequest(Collection<bg1> collection) {
        ArrayList I0 = x53.I0(collection, 200, 200);
        ArrayList arrayList = new ArrayList(z53.S(I0, 10));
        Iterator it = I0.iterator();
        while (it.hasNext()) {
            arrayList.add(getResolveExternalRequestForCandidates((List) it.next()));
        }
        return arrayList;
    }

    private final sk0 getResolveExternalRequestForCandidates(List<bg1> list) {
        rk0 s = tu0.s("vchat.getExternalIdsByOkIds");
        s.b = kl.c;
        s.c.a(new u9e(ApiProtocol.PARAM_UIDS, x53.n0(list, ",", (String) null, (String) null, InternalToExternalIdsMapper$getResolveExternalRequestForCandidates$1.INSTANCE, 30)));
        return s.a(ExternalIdsResponse.INSTANCE);
    }

    public Map<bg1, ParticipantId> map(Collection<bg1> collection) {
        boolean z = jb9.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Background thread expected");
        } else if (collection.isEmpty()) {
            return oz4.a;
        } else {
            List<sk0> batchedExternalsRequest = getBatchedExternalsRequest(collection);
            Uri uri = bl0.X;
            ArrayList arrayList = new ArrayList();
            for (sk0 next : batchedExternalsRequest) {
                arrayList.add(new il(next, next));
            }
            cl0 cl0 = (cl0) RetryKt.retryApiCallForFastWorkRequired(this.okApi.c().a(new bl0((String) null, (il[]) arrayList.toArray(new il[0]), 0)), this.callParams.B.h, this.logger).e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (sk0 a : batchedExternalsRequest) {
                applyExternals((ExternalIdsResponse) cl0.a(a), linkedHashMap);
            }
            return linkedHashMap;
        }
    }
}
