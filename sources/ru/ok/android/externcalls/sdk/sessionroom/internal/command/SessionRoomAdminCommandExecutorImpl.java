package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJg\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001a\u0010\u0012\u001a\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u00060\u0010j\u0002`\u00110\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010!\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J=\u0010$\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020#2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020(2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b)\u0010*J=\u0010,\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020+2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "", "Lyad;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addToRooms", "removeFromRooms", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "externalToInternalIdsMap", "Lo6f;", "buildUpdateRoomsParams", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lo6f;", "Ln7;", "params", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(Ln7;Lk56;Lm56;)V", "Lhgc;", "removeRooms", "(Lhgc;Lk56;Lm56;)V", "Lzge;", "switchRoom", "(Lzge;Lk56;Lm56;)V", "updateRooms", "(Lo6f;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomAdminCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomAdminCommandExecutor {
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;
    private final SignalingProvider signalingProvider;

    public SessionRoomAdminCommandExecutorImpl(SignalingProvider signalingProvider2, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.signalingProvider = signalingProvider2;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    private static final void activateRooms$lambda$0(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    private static final void activateRooms$lambda$1(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("activateRooms", jSONObject, m56);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, m6f] */
    private final o6f buildUpdateRoomsParams(Map<yad, ? extends List<ParticipantId>> map, Map<yad, ? extends List<ParticipantId>> map2, Map<ParticipantId, bg1> map3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<yad> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry next : map.entrySet()) {
            linkedHashSet.add(next.getKey());
            for (ParticipantId participantId : (List) next.getValue()) {
                bg1 bg1 = map3.get(participantId);
                if (bg1 != null) {
                    Object key = next.getKey();
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(key, obj);
                    }
                    ((List) obj).add(bg1);
                }
            }
        }
        for (Map.Entry next2 : map2.entrySet()) {
            linkedHashSet.add(next2.getKey());
            for (ParticipantId participantId2 : (List) next2.getValue()) {
                bg1 bg12 = map3.get(participantId2);
                if (bg12 != null) {
                    Object key2 = next2.getKey();
                    Object obj2 = linkedHashMap2.get(key2);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap2.put(key2, obj2);
                    }
                    ((List) obj2).add(bg12);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(z53.S(linkedHashSet, 10));
        for (yad yad : linkedHashSet) {
            ? obj3 = new Object();
            obj3.a = yad;
            List list = (List) linkedHashMap.get(yad);
            if (list != null) {
                obj3.b = list;
            }
            List list2 = (List) linkedHashMap2.get(yad);
            if (list2 != null) {
                obj3.c = list2;
            }
            arrayList2.add(obj3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m6f m6f = (m6f) it.next();
            arrayList3.add(new n6f(m6f.a, (List) m6f.b, (List) m6f.c));
        }
        return new o6f(arrayList3);
    }

    private static final void removeRooms$lambda$2(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    private static final void removeRooms$lambda$3(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("removeRooms", jSONObject, m56);
    }

    /* access modifiers changed from: private */
    public static final void switchRoom$lambda$4(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void switchRoom$lambda$5(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("switchRoom", jSONObject, m56);
    }

    /* access modifiers changed from: private */
    public static final void updateRooms$lambda$6(k56 k56, JSONObject jSONObject) {
        if (k56 != null) {
            k56.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void updateRooms$lambda$7(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, m56 m56, JSONObject jSONObject) {
        sessionRoomAdminCommandExecutorImpl.parseErrorResponse("updateRooms", jSONObject, m56);
    }

    public void activateRooms(n7 n7Var, k56 k56, m56 m56) {
        throw null;
    }

    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, k56 k56, m56 m56) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(z53.T(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap().values()));
            linkedHashSet.addAll(z53.T(assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap().values()));
            updateRooms(buildUpdateRoomsParams(assignParticipantsToRoomsParams.getAddParticipantsToRoomsMap(), assignParticipantsToRoomsParams.getRemoveParticipantsFromRoomsMap(), this.participantDataProvider.getInternalIdsByExternal(linkedHashSet)), k56, m56);
        } catch (Throwable th) {
            if (m56 != null) {
                m56.invoke(th);
            }
        }
    }

    public void moveParticipant(MoveParticipantParams moveParticipantParams, k56 k56, m56 m56) {
        ParticipantId participantId = moveParticipantParams.getParticipantId();
        if (participantId != null) {
            this.participantDataProvider.resolveInternalIdByExternal(participantId, new SessionRoomAdminCommandExecutorImpl$moveParticipant$1(this, moveParticipantParams, k56, m56), m56);
            return;
        }
        zad toRoomId = moveParticipantParams.getToRoomId();
        if (toRoomId != null) {
            switchRoom(new zge((bg1) null, toRoomId), k56, m56);
            return;
        }
        throw new IllegalArgumentException("Session room id is required".toString());
    }

    public void removeRooms(hgc hgc, k56 k56, m56 m56) {
        throw null;
    }

    public void switchRoom(zge zge, k56 k56, m56 m56) {
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            rod.d(f46.z(zge), false, new mt(8, k56), new uad(this, m56, 0));
        }
    }

    public void updateRooms(o6f o6f, k56 k56, m56 m56) {
        ka6 ka6;
        rod rod = SignalingProviderKt.get(this.signalingProvider, m56);
        if (rod != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "update-rooms");
            Collection<n6f> collection = o6f.a;
            if (collection == null) {
                ka6 = new ka6(jSONObject);
            } else {
                JSONArray jSONArray = new JSONArray();
                for (n6f n6f : collection) {
                    JSONObject jSONObject2 = new JSONObject();
                    yad yad = n6f.a;
                    if (yad != null) {
                        jSONObject2.put("id", yad.a);
                    }
                    Collection<bg1> collection2 = n6f.b;
                    if (collection2 != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (bg1 c : collection2) {
                            jSONArray2.put((Object) c.c());
                        }
                        jSONObject2.put("addParticipantIds", (Object) jSONArray2);
                    }
                    Collection<bg1> collection3 = n6f.c;
                    if (collection3 != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (bg1 c2 : collection3) {
                            jSONArray3.put((Object) c2.c());
                        }
                        jSONObject2.put("removeParticipantIds", (Object) jSONArray3);
                    }
                    jSONArray.put((Object) jSONObject2);
                }
                jSONObject.put("rooms", (Object) jSONArray);
                ka6 = new ka6(jSONObject);
            }
            rod.d(ka6, false, new mt(9, k56), new uad(this, m56, 1));
        }
    }
}
