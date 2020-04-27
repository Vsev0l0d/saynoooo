fun engineStatus(engineNumber:Int): String = try { rawEngineStatus(engineNumber) } catch (e : EngineNotFoundException) {"engine ${engineNumber} not found"} catch (e : SensorsMeltException) {"engine ${engineNumber} offline"}