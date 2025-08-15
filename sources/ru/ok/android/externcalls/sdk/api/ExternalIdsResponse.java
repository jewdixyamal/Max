package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

public class ExternalIdsResponse {
    public static final za7 INSTANCE = new za7() {
        private void parseIds(Map<bg1, ParticipantId> map, db7 db7, boolean z) throws IOException, JsonTypeMismatchException {
            db7.s();
            while (db7.hasNext()) {
                String T = db7.T();
                try {
                    map.put(bg1.a(T), ParticipantId.withoutDeviceId(db7.H(), z));
                } catch (NumberFormatException unused) {
                    GlobalRTCLogger.log(ExternalIdsResponse.LOG_TAG, "got not parsable internal id '" + T + "'");
                }
            }
            db7.q();
        }

        public ExternalIdsResponse parse(db7 db7) throws IOException, JsonParseException {
            HashMap hashMap = new HashMap();
            db7.s();
            while (db7.hasNext()) {
                String T = db7.T();
                T.getClass();
                if (T.equals("external_ids")) {
                    parseIds(hashMap, db7, false);
                } else if (!T.equals("anonym_ids")) {
                    db7.z();
                } else {
                    parseIds(hashMap, db7, true);
                }
            }
            db7.q();
            return new ExternalIdsResponse(hashMap);
        }
    };
    private static final String LOG_TAG = "ExternalIdsResponse";
    private final Map<bg1, ParticipantId> internalToExternal;

    public ExternalIdsResponse(Map<bg1, ParticipantId> map) {
        this.internalToExternal = map;
    }

    public Map<bg1, ParticipantId> getMapping() {
        return this.internalToExternal;
    }
}
