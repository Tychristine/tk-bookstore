import api from '../request.js';

export const cartAdd = (params) => {
    return api({
        url: '/api/cart/add',
        method: 'POST',
        data: params
    })
}

export const cartGet = (params) => {
    return api({
        url: '/api/cart/get',
        method: 'GET',
        data: params
    })
}

export const cartDelete = (params) => {
    return api({
        url: '/api/cart/delete',
        method: 'POST',
        data: params
    })
}

export const cartUpdate = (params) => {
    return api({
        url: '/api/cart/update',
        method: 'POST',
        data: params
    })
}

export const cartDeleteAll = (params) => {
    return api({
        url: '/api/cart/delete/all',
        method: 'POST',
        data: params
    })
}