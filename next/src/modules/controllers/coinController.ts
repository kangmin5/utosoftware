import { SERVER_8080 } from "@/components/common/Path";
import axios from "axios";
import { Coin } from "../types";

const headers = {
    "Content-Type" : "application/json",
    Authorization: "JWT fefege...",
} 
export class coinController {
    async readList ()  : Promise<any> {
        try{
            const response =
                await axios.get(`${SERVER_8080}/coins/findAll`)
            return response.data
        } catch (err) {
            return(err)
        }
    }

    async saveCoin(payload: Coin){
        try {
            alert('api 진입') 
            await axios.post(`${SERVER_8080}/coins/save`, payload, { headers })
            
        } catch (err) {
            return(err)
        }
    }
}


