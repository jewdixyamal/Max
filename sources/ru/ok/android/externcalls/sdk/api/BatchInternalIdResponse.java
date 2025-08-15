package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

public class BatchInternalIdResponse {
    public static final za7 PARSER = new xw0(29);
    public final Map<ParticipantId, bg1> externalToInternalIdsMap;

    public BatchInternalIdResponse(Map<ParticipantId, bg1> map) {
        this.externalToInternalIdsMap = map;
    }

    public static BatchInternalIdResponse parse(db7 db7) throws IOException, JsonTypeMismatchException {
        HashMap hashMap = new HashMap();
        db7.s();
        while (db7.hasNext()) {
            if (db7.T().equals("ids")) {
                readIdsArray(db7, hashMap);
            } else {
                db7.z();
            }
        }
        db7.q();
        return new BatchInternalIdResponse(hashMap);
    }

    private static ParticipantId readExternalId(db7 db7) throws IOException, JsonTypeMismatchException {
        db7.s();
        String str = null;
        Boolean bool = null;
        while (db7.hasNext()) {
            String T = db7.T();
            T.getClass();
            if (T.equals("id")) {
                str = db7.H();
            } else if (!T.equals("ok_anonym")) {
                db7.z();
            } else {
                bool = Boolean.valueOf(db7.a0());
            }
        }
        db7.q();
        if (str == null || bool == null) {
            return null;
        }
        return ParticipantId.withoutDeviceId(str, bool.booleanValue());
    }

    private static void readIdMapping(db7 db7, Map<ParticipantId, bg1> map) throws IOException, JsonTypeMismatchException {
        db7.s();
        bg1 bg1 = null;
        ParticipantId participantId = null;
        while (db7.hasNext()) {
            String T = db7.T();
            T.getClass();
            if (T.equals("external_user_id")) {
                participantId = readExternalId(db7);
            } else if (!T.equals("ok_user_id")) {
                db7.z();
            } else {
                bg1 = bg1.a(db7.H());
            }
        }
        db7.q();
        if (bg1 != null && participantId != null) {
            map.put(participantId, bg1);
        }
    }

    private static void readIdsArray(db7 db7, Map<ParticipantId, bg1> map) throws IOException, JsonTypeMismatchException {
        db7.u();
        while (db7.hasNext()) {
            readIdMapping(db7, map);
        }
        db7.t();
    }
}
