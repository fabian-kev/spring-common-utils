package com.fabiankevin.commonutils.serializer.gson;

//public class RejectReasonDeserializer implements JsonDeserializer<List<IdVerificationDetailEnvelope.Verification.RejectReasonDetail>> {
//
//    @Override
//    public List<IdVerificationDetailEnvelope.Verification.RejectReasonDetail> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//        try {
//            if( json.isJsonArray() ){
//                JsonArray jsonArray = json.getAsJsonArray();
//                return IntStream.range(0, jsonArray.size())
//                        .boxed()
//                        .map(idx -> IdVerificationDetailEnvelope.Verification.RejectReasonDetail.builder()
//                                .detailsCode(jsonArray.get(idx).getAsJsonObject().get("detailsCode").toString())
//                                .detailsDescription(jsonArray.get(idx).getAsJsonObject().get("detailsDescription").toString())
//                                .build()).collect(Collectors.toList());
//
//            }
//            return Arrays.asList(
//                    IdVerificationDetailEnvelope.Verification.RejectReasonDetail.builder()
//                            .detailsCode(json.getAsJsonObject().get("detailsCode").toString())
//                            .detailsDescription(json.getAsJsonObject().get("detailsDescription").toString())
//                            .build()
//            );
//
//        } catch(Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
